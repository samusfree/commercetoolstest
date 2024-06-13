package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Image;
import com.e2x.kata.catalogservice.model.Price;
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
 * Variant
 */


public class Variant implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("variantId")
  private String variantId;

  @JsonProperty("key")
  private String key;

  @JsonProperty("price")
  private Price price;

  @JsonProperty("inventory")
  private Long inventory;

  @JsonProperty("images")
  @Valid
  private List<Image> images = null;

  public Variant variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * Get variantId
   * @return variantId
  */
  
  @Schema(name = "variantId", required = false)
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  public Variant key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", required = false)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Variant price(Price price) {
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

  public Variant inventory(Long inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * @return inventory
  */
  
  @Schema(name = "inventory", example = "0", required = false)
  public Long getInventory() {
    return inventory;
  }

  public void setInventory(Long inventory) {
    this.inventory = inventory;
  }

  public Variant images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Variant addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", example = "[]", required = false)
  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variant variant = (Variant) o;
    return Objects.equals(this.variantId, variant.variantId) &&
        Objects.equals(this.key, variant.key) &&
        Objects.equals(this.price, variant.price) &&
        Objects.equals(this.inventory, variant.inventory) &&
        Objects.equals(this.images, variant.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, key, price, inventory, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variant {\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

