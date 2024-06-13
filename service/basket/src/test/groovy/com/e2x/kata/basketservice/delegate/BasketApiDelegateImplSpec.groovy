package com.e2x.kata.basketservice.delegate;

import com.e2x.kata.basketservice.model.Address;
import com.e2x.kata.basketservice.model.Basket;
import com.e2x.kata.basketservice.model.CommerceItemId;
import com.e2x.kata.basketservice.model.CustomerEmail;
import com.e2x.kata.basketservice.model.Product;

import io.sphere.sdk.client.SphereClient

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


  /**
   * A specification class for the delegate implementation
   */
    
class BasketApiDelegateImplSpec extends Specification {
  private BasketApiDelegateImpl testObj

  @Autowired private SphereClientInteraction sphereClientInteraction

  @SpringBean
  private SphereClient sphereClient = Mock()


  def setup() {
        sphereClientInteraction = new SphereClientInteraction((sphereClient))
        testObj = new BasketApiDelegateImpl(sphereClientInteraction)

  }



  def '/basket/{customerId}/add for addToBasketByCustomerId'() {
    given:
        Object customerId = null
        Object product = null
    when:
    def entityResponse = testObj.addToBasketByCustomerId(customerIdproduct)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/basket/{customerId} for getBasketByCustomerId'() {
    given:
        Object customerId = null
    when:
    def entityResponse = testObj.getBasketByCustomerId(customerId)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/basket/{customerId}/remove for removeFromBasketByCustomerId'() {
    given:
        Object customerId = null
        Object commerceItemId = null
    when:
    def entityResponse = testObj.removeFromBasketByCustomerId(customerIdcommerceItemId)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/basket/{customerId}/billing-address for setBillingAddressByCustomerId'() {
    given:
        Object customerId = null
        Object address = null
    when:
    def entityResponse = testObj.setBillingAddressByCustomerId(customerIdaddress)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/basket/{customerId}/email for setEmailAddressByCustomerId'() {
    given:
        Object customerId = null
        Object customerEmail = null
    when:
    def entityResponse = testObj.setEmailAddressByCustomerId(customerIdcustomerEmail)

    then:
    entityResponse.statusCode.value() == 200
  }



  def '/basket/{customerId}/shipping-address for setShippingAddressByCustomerId'() {
    given:
        Object customerId = null
        Object address = null
    when:
    def entityResponse = testObj.setShippingAddressByCustomerId(customerIdaddress)

    then:
    entityResponse.statusCode.value() == 200
  }

}
