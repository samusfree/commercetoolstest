package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Product;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class ProductApiDelegateImplSpec extends Specification {
  private ProductApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new ProductApiDelegateImpl(sphereClientInteraction)

  }



  def '/product/{productKey} for getProductByKey'() {
    given:
        Object productKey = null
    when:
    def entityResponse = testObj.getProductByKey(productKey)

    then:
    entityResponse.statusCode.value() == 200
  }

}
