package com.e2x.kata.basketservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.basketservice.model.CommerceItem;
import com.e2x.kata.basketservice.model.Customer;
import com.e2x.kata.basketservice.model.PaymentInfo;
import com.e2x.kata.basketservice.model.Price;
import com.e2x.kata.basketservice.model.ShippingInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Basket
 */


public class Basket implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("basketId")
  private String basketId;

  @JsonProperty("anonCustomerId")
  private String anonCustomerId;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("customerEmail")
  private String customerEmail;

  @JsonProperty("commerceItems")
  @Valid
  private List<CommerceItem> commerceItems = null;

  @JsonProperty("numberOfItems")
  private Integer numberOfItems;

  @JsonProperty("price")
  private Price price;

  @JsonProperty("shippingInfo")
  private ShippingInfo shippingInfo;

  @JsonProperty("paymentInfo")
  private PaymentInfo paymentInfo;

  @JsonProperty("customer")
  private Customer customer;

  public Basket basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * Get basketId
   * @return basketId
  */
  
  @Schema(name = "basketId", required = false)
  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  public Basket anonCustomerId(String anonCustomerId) {
    this.anonCustomerId = anonCustomerId;
    return this;
  }

  /**
   * Get anonCustomerId
   * @return anonCustomerId
  */
  
  @Schema(name = "anonCustomerId", required = false)
  public String getAnonCustomerId() {
    return anonCustomerId;
  }

  public void setAnonCustomerId(String anonCustomerId) {
    this.anonCustomerId = anonCustomerId;
  }

  public Basket customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", required = false)
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Basket customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * Get customerEmail
   * @return customerEmail
  */
  @Email
  @Schema(name = "customerEmail", required = false)
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public Basket commerceItems(List<CommerceItem> commerceItems) {
    this.commerceItems = commerceItems;
    return this;
  }

  public Basket addCommerceItemsItem(CommerceItem commerceItemsItem) {
    if (this.commerceItems == null) {
      this.commerceItems = new ArrayList<>();
    }
    this.commerceItems.add(commerceItemsItem);
    return this;
  }

  /**
   * Get commerceItems
   * @return commerceItems
  */
  @Valid 
  @Schema(name = "commerceItems", example = "[]", required = false)
  public List<CommerceItem> getCommerceItems() {
    return commerceItems;
  }

  public void setCommerceItems(List<CommerceItem> commerceItems) {
    this.commerceItems = commerceItems;
  }

  public Basket numberOfItems(Integer numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

  /**
   * Get numberOfItems
   * minimum: 0
   * @return numberOfItems
  */
  @Min(0) 
  @Schema(name = "numberOfItems", required = false)
  public Integer getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Integer numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public Basket price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", required = false)
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Basket shippingInfo(ShippingInfo shippingInfo) {
    this.shippingInfo = shippingInfo;
    return this;
  }

  /**
   * Get shippingInfo
   * @return shippingInfo
  */
  @Valid 
  @Schema(name = "shippingInfo", required = false)
  public ShippingInfo getShippingInfo() {
    return shippingInfo;
  }

  public void setShippingInfo(ShippingInfo shippingInfo) {
    this.shippingInfo = shippingInfo;
  }

  public Basket paymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

  /**
   * Get paymentInfo
   * @return paymentInfo
  */
  @Valid 
  @Schema(name = "paymentInfo", required = false)
  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public Basket customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "customer", required = false)
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Basket basket = (Basket) o;
    return Objects.equals(this.basketId, basket.basketId) &&
        Objects.equals(this.anonCustomerId, basket.anonCustomerId) &&
        Objects.equals(this.customerId, basket.customerId) &&
        Objects.equals(this.customerEmail, basket.customerEmail) &&
        Objects.equals(this.commerceItems, basket.commerceItems) &&
        Objects.equals(this.numberOfItems, basket.numberOfItems) &&
        Objects.equals(this.price, basket.price) &&
        Objects.equals(this.shippingInfo, basket.shippingInfo) &&
        Objects.equals(this.paymentInfo, basket.paymentInfo) &&
        Objects.equals(this.customer, basket.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basketId, anonCustomerId, customerId, customerEmail, commerceItems, numberOfItems, price, shippingInfo, paymentInfo, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basket {\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    anonCustomerId: ").append(toIndentedString(anonCustomerId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    commerceItems: ").append(toIndentedString(commerceItems)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shippingInfo: ").append(toIndentedString(shippingInfo)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

