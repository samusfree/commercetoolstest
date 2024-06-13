# commercetools-training

### How to run the services

Each service can run individually, for that you must set the correct java version (17) as well as the correct Gradle version (7.6).

Then set up the application to be run with Spring Boot (if using IntelliJ IDEA Ultimate) or as an Application (if running community edition)

#### Using IntelliJ IDEA Ultimate Edition

To set up the project to run with **Spring Boot**, create a new configuration and choose the option for SB, then select the module with the name of the service like the following examples:

| Service | Module |
|--|--|
| Search | search.main |
| Basket | basket.main |

Then select the main class, this is located inside the `invoker` package of the service:

| Service | Main Class |
|--|--|
| Search | SearchServiceSpringBootApp |
| Basket | BasketServiceSpringBootApp |

After this setup is done, then press the run button to execute the application

#### Using IntelliJ IDEA CE

Create a new configuration and choose the option for **Application**, then select the module with the name of the service like the following examples:

| Service | Module |
|--|--|
| Search | search.main |
| Basket | basket.main |

Then select the main class, this is located inside the `invoker` package of the service:

| Service | Main Class |
|--|--|
| Search | SearchServiceSpringBootApp |
| Basket | BasketServiceSpringBootApp |

After this setup is done, then press the run button to execute the application

#### Running the application from the console

To run the application from the console, use this command:

```bash
./gradlew bootRun
```

Al three options will show you the following message after the application starts:

```bash
           ******      *****.        @@@@@     @@@@@@@@@@@@@@@    @@@@@
   * ** *, ******    *****          @@@@@@@         @@@@         @@@@@@@
    *  *  ******* ******           @@@@ (@@@        @@@@        @@@@ @@@@
   *  **  *  ********             @@@@   @@@@       @@@@       @@@@   @@@@
  *    *  ********,  ****        @@@@,,,,,@@@@      @@@@      @@@@,,,,,@@@@
      **    *****     *****     @@@@@@@@@@@@@@@     @@@@     @@@@@@@@@@@@@@@
       * ,* *****      .****   @@@@         @@@@/   @@@@    @@@@         @@@@

 :: Kata :: Kickstarter for API-First Transactional Applications :: 
 :: Kata :: SearchService KATA Spring Boot Application ::
```

Before attempting to complete the exercises, you need to set the appropriate credentials in the `application.properties` file:

```yaml
# Change these values to set the correct credentials for your commercetools project
ctp.projectKey=...
ctp.clientId=...
ctp.clientSecret=<secret key>
```

It is assumed that your commercetools project is hosted in Europe GCP region. If not, please edit `com/e2x/kata/<project-name>/config/CommercetoolsConfig.java`and set the correct region:

```java
return ApiRootBuilder.of()
            .defaultClient(
                    ClientCredentials.of()
                            .withClientId(clientId)
                            .withClientSecret(clientSecret)
                            .build(),
                    // Change below property to your project region if it is different
                    ServiceRegion.GCP_EUROPE_WEST1 
            ).build(projectKey);
```

If you fail to set these properties or set incorrect values, you will receive 401 errors while performing operations on commercetools through the sdk

### Where to make changes to the code:

Each project contains a Delegate implementation class which handles the implementation for the controller:

| Service | Path to delegate packages |
|--|--|
| Search | ./service/search/src/main/java/com/e2x/kata/searchservice/delegate |
| Basket | ./service/basket/src/main/java/com/e2x/kata/basketservice/delegate |
| Catalog | ./service/catalog/src/main/java/com/e2x/kata/catalogservice/delegate |
| Customer | ./service/customer/src/main/java/com/e2x/kata/customerservice/delegate |
| Recommendations | ./service/recommendations/src/main/java/com/e2x/kata/recommendationsservice/delegate |


```java
	public CatalogApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CatalogApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CatalogApiDelegate() {});
        // ...
    }
```

As an example, here we can see the controller receiving the delegate interface. This delegate has an implementation that can be found inside the `delegate` package for each service.

```java
@Service
public class CatalogApiDelegateImpl implements CatalogApiDelegate {
	//...
}
```

The delegate implements the interface and is where we should modify our code to get the API to respond to a call.


The delegate implementations for some projects may not be reached if they are lacking the `@Service` annotation from `Spring Boot`. They need to be annotated with that stereotype in order to become available to Spring Boot so that they can be injected into the controller.
