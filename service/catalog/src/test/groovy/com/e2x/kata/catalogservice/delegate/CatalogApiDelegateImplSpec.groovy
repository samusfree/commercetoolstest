package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Catalog;
import com.e2x.kata.catalogservice.model.CatalogList;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class CatalogApiDelegateImplSpec extends Specification {
  private CatalogApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new CatalogApiDelegateImpl(sphereClientInteraction)

  }



  def '/catalog/{catalogId} for getCatalogById'() {
    given:
        Object catalogId = null
    when:
    def entityResponse = testObj.getCatalogById(catalogId)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/catalog for getCatalogs'() {
    given:
    when:
    def entityResponse = testObj.getCatalogs()

    then:
    entityResponse.statusCode.value() == 200
  }

}
