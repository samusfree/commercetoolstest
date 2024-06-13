package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Category;
import com.e2x.kata.catalogservice.model.CategoryList;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class CategoryApiDelegateImplSpec extends Specification {
  private CategoryApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new CategoryApiDelegateImpl(sphereClientInteraction)

  }



  def '/category/{seoSlug} for getCategoryBySlug'() {
    given:
        Object seoSlug = null
    when:
    def entityResponse = testObj.getCategoryBySlug(seoSlug)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/category for getRootCategories'() {
    given:
    when:
    def entityResponse = testObj.getRootCategories()

    then:
    entityResponse.statusCode.value() == 200
  }

}
