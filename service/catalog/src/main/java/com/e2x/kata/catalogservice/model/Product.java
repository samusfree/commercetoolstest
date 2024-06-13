package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Category;
import com.e2x.kata.catalogservice.model.CategoryList;
import com.e2x.kata.catalogservice.model.Image;
import com.e2x.kata.catalogservice.model.Price;
import com.e2x.kata.catalogservice.model.VariantList;
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
 * Product
 */


public class Product implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("rating")
  private Integer rating;

  @JsonProperty("masterPrice")
  private Price masterPrice;

  @JsonProperty("parentCategory")
  private Category parentCategory;

  @JsonProperty("categories")
  private CategoryList categories;

  @JsonProperty("variants")
  private VariantList variants;

  @JsonProperty("images")
  @Valid
  private List<Image> images = null;

  public Product productId(String productId) {
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

  public Product key(String key) {
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

  public Product name(String name) {
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

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  
  @Schema(name = "rating", example = "0", required = false)
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Product masterPrice(Price masterPrice) {
    this.masterPrice = masterPrice;
    return this;
  }

  /**
   * Get masterPrice
   * @return masterPrice
  */
  @Valid 
  @Schema(name = "masterPrice", required = false)
  public Price getMasterPrice() {
    return masterPrice;
  }

  public void setMasterPrice(Price masterPrice) {
    this.masterPrice = masterPrice;
  }

  public Product parentCategory(Category parentCategory) {
    this.parentCategory = parentCategory;
    return this;
  }

  /**
   * Get parentCategory
   * @return parentCategory
  */
  @Valid 
  @Schema(name = "parentCategory", required = false)
  public Category getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(Category parentCategory) {
    this.parentCategory = parentCategory;
  }

  public Product categories(CategoryList categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", required = false)
  public CategoryList getCategories() {
    return categories;
  }

  public void setCategories(CategoryList categories) {
    this.categories = categories;
  }

  public Product variants(VariantList variants) {
    this.variants = variants;
    return this;
  }

  /**
   * Get variants
   * @return variants
  */
  @Valid 
  @Schema(name = "variants", required = false)
  public VariantList getVariants() {
    return variants;
  }

  public void setVariants(VariantList variants) {
    this.variants = variants;
  }

  public Product images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Product addImagesItem(Image imagesItem) {
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
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.key, product.key) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.rating, product.rating) &&
        Objects.equals(this.masterPrice, product.masterPrice) &&
        Objects.equals(this.parentCategory, product.parentCategory) &&
        Objects.equals(this.categories, product.categories) &&
        Objects.equals(this.variants, product.variants) &&
        Objects.equals(this.images, product.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, key, name, description, rating, masterPrice, parentCategory, categories, variants, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    masterPrice: ").append(toIndentedString(masterPrice)).append("\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

