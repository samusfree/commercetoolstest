package com.e2x.kata.basketservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.basketservice.model.Price;
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
 * CommerceItem
 */


public class CommerceItem implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("commerceItemId")
  private String commerceItemId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("productSlug")
  private String productSlug;

  @JsonProperty("productImage")
  private String productImage;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("variantId")
  private Integer variantId;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("price")
  private Price price;

  public CommerceItem commerceItemId(String commerceItemId) {
    this.commerceItemId = commerceItemId;
    return this;
  }

  /**
   * Get commerceItemId
   * @return commerceItemId
  */
  
  @Schema(name = "commerceItemId", required = false)
  public String getCommerceItemId() {
    return commerceItemId;
  }

  public void setCommerceItemId(String commerceItemId) {
    this.commerceItemId = commerceItemId;
  }

  public CommerceItem name(String name) {
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

  public CommerceItem productSlug(String productSlug) {
    this.productSlug = productSlug;
    return this;
  }

  /**
   * Get productSlug
   * @return productSlug
  */
  
  @Schema(name = "productSlug", required = false)
  public String getProductSlug() {
    return productSlug;
  }

  public void setProductSlug(String productSlug) {
    this.productSlug = productSlug;
  }

  public CommerceItem productImage(String productImage) {
    this.productImage = productImage;
    return this;
  }

  /**
   * Get productImage
   * @return productImage
  */
  
  @Schema(name = "productImage", required = false)
  public String getProductImage() {
    return productImage;
  }

  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }

  public CommerceItem productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", required = false)
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CommerceItem variantId(Integer variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * Get variantId
   * @return variantId
  */
  
  @Schema(name = "variantId", required = false)
  public Integer getVariantId() {
    return variantId;
  }

  public void setVariantId(Integer variantId) {
    this.variantId = variantId;
  }

  public CommerceItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", required = false)
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public CommerceItem price(Price price) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceItem commerceItem = (CommerceItem) o;
    return Objects.equals(this.commerceItemId, commerceItem.commerceItemId) &&
        Objects.equals(this.name, commerceItem.name) &&
        Objects.equals(this.productSlug, commerceItem.productSlug) &&
        Objects.equals(this.productImage, commerceItem.productImage) &&
        Objects.equals(this.productId, commerceItem.productId) &&
        Objects.equals(this.variantId, commerceItem.variantId) &&
        Objects.equals(this.quantity, commerceItem.quantity) &&
        Objects.equals(this.price, commerceItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceItemId, name, productSlug, productImage, productId, variantId, quantity, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceItem {\n");
    sb.append("    commerceItemId: ").append(toIndentedString(commerceItemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productSlug: ").append(toIndentedString(productSlug)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

