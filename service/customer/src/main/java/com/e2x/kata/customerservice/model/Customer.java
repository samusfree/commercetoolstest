package com.e2x.kata.customerservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.customerservice.model.Address;
import com.e2x.kata.customerservice.model.LoginDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Customer
 */


public class Customer implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("loginDetails")
  private LoginDetails loginDetails;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("basketId")
  private String basketId;

  @JsonProperty("shippingSame")
  private Boolean shippingSame;

  @JsonProperty("billingSame")
  private Boolean billingSame;

  public Customer customerId(String customerId) {
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

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer loginDetails(LoginDetails loginDetails) {
    this.loginDetails = loginDetails;
    return this;
  }

  /**
   * Get loginDetails
   * @return loginDetails
  */
  @Valid 
  @Schema(name = "loginDetails", required = false)
  public LoginDetails getLoginDetails() {
    return loginDetails;
  }

  public void setLoginDetails(LoginDetails loginDetails) {
    this.loginDetails = loginDetails;
  }

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer basketId(String basketId) {
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

  public Customer shippingSame(Boolean shippingSame) {
    this.shippingSame = shippingSame;
    return this;
  }

  /**
   * Get shippingSame
   * @return shippingSame
  */
  
  @Schema(name = "shippingSame", required = false)
  public Boolean getShippingSame() {
    return shippingSame;
  }

  public void setShippingSame(Boolean shippingSame) {
    this.shippingSame = shippingSame;
  }

  public Customer billingSame(Boolean billingSame) {
    this.billingSame = billingSame;
    return this;
  }

  /**
   * Get billingSame
   * @return billingSame
  */
  
  @Schema(name = "billingSame", required = false)
  public Boolean getBillingSame() {
    return billingSame;
  }

  public void setBillingSame(Boolean billingSame) {
    this.billingSame = billingSame;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.loginDetails, customer.loginDetails) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.basketId, customer.basketId) &&
        Objects.equals(this.shippingSame, customer.shippingSame) &&
        Objects.equals(this.billingSame, customer.billingSame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, name, loginDetails, address, basketId, shippingSame, billingSame);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loginDetails: ").append(toIndentedString(loginDetails)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    shippingSame: ").append(toIndentedString(shippingSame)).append("\n");
    sb.append("    billingSame: ").append(toIndentedString(billingSame)).append("\n");
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

