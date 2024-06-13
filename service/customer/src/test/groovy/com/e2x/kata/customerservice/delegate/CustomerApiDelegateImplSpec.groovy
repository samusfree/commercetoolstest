package com.e2x.kata.customerservice.delegate;

import com.e2x.kata.customerservice.model.Customer;
import com.e2x.kata.customerservice.model.LoginDetails;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class CustomerApiDelegateImplSpec extends Specification {
  private CustomerApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new CustomerApiDelegateImpl(sphereClientInteraction)

  }



  def '/customer/{customerId} for deleteByCustomerId'() {
    given:
        Object customerId = null
    when:
    def entityResponse = testObj.deleteByCustomerId(customerId)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/customer for getCustomerByEmail'() {
    given:
        Object emailAddress = null
    when:
    def entityResponse = testObj.getCustomerByEmail(emailAddress)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/customer/login for loginCustomer'() {
    given:
        Object loginDetails = null
    when:
    def entityResponse = testObj.loginCustomer(loginDetails)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/customer for register'() {
    given:
        Object customer = null
    when:
    def entityResponse = testObj.register(customer)

    then:
    entityResponse.statusCode.value() == 200
  }

}
