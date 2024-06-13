package com.e2x.kata.basketservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.basketservice.model.Address;
import com.e2x.kata.basketservice.model.CommerceItem;
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
 * PaymentInfo
 */


public class PaymentInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("paymentInfoId")
  private String paymentInfoId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("paymentPayload")
  private String paymentPayload;

  @JsonProperty("commerceItems")
  @Valid
  private List<CommerceItem> commerceItems = null;

  @JsonProperty("address")
  private Address address;

  public PaymentInfo paymentInfoId(String paymentInfoId) {
    this.paymentInfoId = paymentInfoId;
    return this;
  }

  /**
   * Get paymentInfoId
   * @return paymentInfoId
  */
  
  @Schema(name = "paymentInfoId", required = false)
  public String getPaymentInfoId() {
    return paymentInfoId;
  }

  public void setPaymentInfoId(String paymentInfoId) {
    this.paymentInfoId = paymentInfoId;
  }

  public PaymentInfo name(String name) {
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

  public PaymentInfo paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  
  @Schema(name = "paymentType", required = false)
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentInfo paymentPayload(String paymentPayload) {
    this.paymentPayload = paymentPayload;
    return this;
  }

  /**
   * Get paymentPayload
   * @return paymentPayload
  */
  
  @Schema(name = "paymentPayload", required = false)
  public String getPaymentPayload() {
    return paymentPayload;
  }

  public void setPaymentPayload(String paymentPayload) {
    this.paymentPayload = paymentPayload;
  }

  public PaymentInfo commerceItems(List<CommerceItem> commerceItems) {
    this.commerceItems = commerceItems;
    return this;
  }

  public PaymentInfo addCommerceItemsItem(CommerceItem commerceItemsItem) {
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
  @Schema(name = "commerceItems", required = false)
  public List<CommerceItem> getCommerceItems() {
    return commerceItems;
  }

  public void setCommerceItems(List<CommerceItem> commerceItems) {
    this.commerceItems = commerceItems;
  }

  public PaymentInfo address(Address address) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.paymentInfoId, paymentInfo.paymentInfoId) &&
        Objects.equals(this.name, paymentInfo.name) &&
        Objects.equals(this.paymentType, paymentInfo.paymentType) &&
        Objects.equals(this.paymentPayload, paymentInfo.paymentPayload) &&
        Objects.equals(this.commerceItems, paymentInfo.commerceItems) &&
        Objects.equals(this.address, paymentInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInfoId, name, paymentType, paymentPayload, commerceItems, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    sb.append("    paymentInfoId: ").append(toIndentedString(paymentInfoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentPayload: ").append(toIndentedString(paymentPayload)).append("\n");
    sb.append("    commerceItems: ").append(toIndentedString(commerceItems)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

