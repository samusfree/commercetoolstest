package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Catalog;
import com.e2x.kata.catalogservice.model.CategoryList;
import com.e2x.kata.catalogservice.model.ProductList;
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
 * Category
 */


public class Category implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("categoryId")
  private String categoryId;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("parentCategory")
  private Category parentCategory;

  @JsonProperty("rootCategory")
  private Category rootCategory;

  @JsonProperty("catalog")
  private Catalog catalog;

  @JsonProperty("subCategories")
  private CategoryList subCategories;

  @JsonProperty("products")
  private ProductList products;

  public Category categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", required = false)
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public Category key(String key) {
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

  public Category name(String name) {
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

  public Category slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", required = false)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Category parentCategory(Category parentCategory) {
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

  public Category rootCategory(Category rootCategory) {
    this.rootCategory = rootCategory;
    return this;
  }

  /**
   * Get rootCategory
   * @return rootCategory
  */
  @Valid 
  @Schema(name = "rootCategory", required = false)
  public Category getRootCategory() {
    return rootCategory;
  }

  public void setRootCategory(Category rootCategory) {
    this.rootCategory = rootCategory;
  }

  public Category catalog(Catalog catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * Get catalog
   * @return catalog
  */
  @Valid 
  @Schema(name = "catalog", required = false)
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  public Category subCategories(CategoryList subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  /**
   * Get subCategories
   * @return subCategories
  */
  @Valid 
  @Schema(name = "subCategories", required = false)
  public CategoryList getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(CategoryList subCategories) {
    this.subCategories = subCategories;
  }

  public Category products(ProductList products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
  */
  @Valid 
  @Schema(name = "products", required = false)
  public ProductList getProducts() {
    return products;
  }

  public void setProducts(ProductList products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryId, category.categoryId) &&
        Objects.equals(this.key, category.key) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.slug, category.slug) &&
        Objects.equals(this.parentCategory, category.parentCategory) &&
        Objects.equals(this.rootCategory, category.rootCategory) &&
        Objects.equals(this.catalog, category.catalog) &&
        Objects.equals(this.subCategories, category.subCategories) &&
        Objects.equals(this.products, category.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, key, name, slug, parentCategory, rootCategory, catalog, subCategories, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
    sb.append("    rootCategory: ").append(toIndentedString(rootCategory)).append("\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

