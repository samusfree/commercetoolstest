package com.e2x.kata.searchservice.delegate;

import com.e2x.kata.searchservice.model.FilterDefinitions;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class FiltersApiDelegateImplSpec extends Specification {
  private FiltersApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new FiltersApiDelegateImpl(sphereClientInteraction)

  }



  def '/filters/{language} for retrieveFilters'() {
    given:
        Object language = null
    when:
    def entityResponse = testObj.retrieveFilters(language)

    then:
    entityResponse.statusCode.value() == 200
  }

}
