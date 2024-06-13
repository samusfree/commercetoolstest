package com.e2x.kata.recommendationsservice.delegate;

import com.e2x.kata.recommendationsservice.model.Recommendations;


import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class RecommendApiDelegateImplSpec extends Specification {
  private RecommendApiDelegateImpl testObj



  def setup() {
        testObj = new RecommendApiDelegateImpl()

  }



  def '/recommend for recommend'() {
    given:
    when:
    def entityResponse = testObj.recommend()

    then:
    entityResponse.statusCode.value() == 200
  }

}
