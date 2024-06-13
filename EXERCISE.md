## CommerceTools Sandbox Exercise
 
### To carry out the integration exercise with Commercetools and practice implementing the delegates in the different modules of your project, follow these detailed instructions:
 
#### Step 1: Create a Commercetools Account
1. Visit the Commercetools website and look for the option to create a trial account. 
2. Follow the on-screen instructions to register. You will need to provide some basic information such as your email, name, and company. 
2. Once your account is active, log in to the Commercetools Merchant Center.
 
#### Step 2: Create a Project in Commercetools
1. Upon entering the Commercetools Merchant Center, click on “Start with Sample Data”. Then, choose “B2C”.
2. Next, enter the organization and project information.
3. Finalize the creation of the project and wait for it to be ready.
 
#### Step 3: Obtain API Credentials
1. Once your project is ready, navigate to the "Settings" section within your project's dashboard.
2. Look for the "Developer Settings" or "API Clients" section.
3. Create a new API Client. During this process, select the profile that gives you the necessary permissions to perform CRUD operations (Create, Read, Update, Delete) on products. Generally, this profile can be "Administrator" or something similar.
4. Save the generated credentials (Client ID, Client Secret, and access token) in a safe place. You will need them to configure your application.
 
#### Step 4: Configure the Credentials in Your Application
1. Locate the application.properties file within each of the modules of your project (search, basket, catalog, customer, etc.).
2. Replace the value of ctp.clientSecret with the Client Secret you obtained in the previous step. Also, make sure to correctly configure the ctp.apiUrl and ctp.scopes properties with the appropriate values for your Commercetools project.
 
#### Step 5: Implement the Delegates
1. For each of the modules (search, basket, catalog, customer, etc.), locate the corresponding delegate package. For example, for the catalog module, the path would be ./service/catalog/src/main/java/com/e2x/kata/catalogservice/delegate.
2. Within each delegate package, you will find an interface and its implementation. Your task is to modify the implementation (*ApiDelegateImpl classes) to make calls to the Commercetools API and manipulate the data according to your project's needs.
3. For instance, in the CatalogApiDelegateImpl, you could implement logic to fetch products from Commercetools and return them in the method that handles catalog requests.
 
#### Step 6: Test the Integration
1. Use the dummy data available in your Commercetools account to test the integration.
2. You can run your application from IntelliJ IDEA or from the console using the command ./gradlew bootRun.
3. Verify that the application starts correctly and perform tests to ensure that data from Commercetools is being retrieved and displayed as expected.
