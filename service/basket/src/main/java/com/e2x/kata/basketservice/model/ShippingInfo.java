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
 * ShippingInfo
 */


public class ShippingInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("shippingInfoId")
  private String shippingInfoId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("commerceItems")
  @Valid
  private List<CommerceItem> commerceItems = null;

  public ShippingInfo shippingInfoId(String shippingInfoId) {
    this.shippingInfoId = shippingInfoId;
    return this;
  }

  /**
   * Get shippingInfoId
   * @return shippingInfoId
  */
  
  @Schema(name = "shippingInfoId", required = false)
  public String getShippingInfoId() {
    return shippingInfoId;
  }

  public void setShippingInfoId(String shippingInfoId) {
    this.shippingInfoId = shippingInfoId;
  }

  public ShippingInfo name(String name) {
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

  public ShippingInfo address(Address address) {
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

  public ShippingInfo commerceItems(List<CommerceItem> commerceItems) {
    this.commerceItems = commerceItems;
    return this;
  }

  public ShippingInfo addCommerceItemsItem(CommerceItem commerceItemsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingInfo shippingInfo = (ShippingInfo) o;
    return Objects.equals(this.shippingInfoId, shippingInfo.shippingInfoId) &&
        Objects.equals(this.name, shippingInfo.name) &&
        Objects.equals(this.address, shippingInfo.address) &&
        Objects.equals(this.commerceItems, shippingInfo.commerceItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingInfoId, name, address, commerceItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInfo {\n");
    sb.append("    shippingInfoId: ").append(toIndentedString(shippingInfoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    commerceItems: ").append(toIndentedString(commerceItems)).append("\n");
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

