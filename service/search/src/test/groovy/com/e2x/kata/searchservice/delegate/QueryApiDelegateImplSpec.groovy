package com.e2x.kata.searchservice.delegate;

import com.e2x.kata.searchservice.model.QueryParams;
import com.e2x.kata.searchservice.model.SearchResult;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class QueryApiDelegateImplSpec extends Specification {
  private QueryApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new QueryApiDelegateImpl(sphereClientInteraction)

  }



  def '/query for searchByParams'() {
    given:
        Object queryParams = null
    when:
    def entityResponse = testObj.searchByParams(queryParams)

    then:
    entityResponse.statusCode.value() == 200
  }

}
