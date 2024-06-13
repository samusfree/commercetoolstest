package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Category;
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
 * Catalog
 */


public class Catalog implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("catalogId")
  private String catalogId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rootCategories")
  @Valid
  private List<Category> rootCategories = null;

  public Catalog catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Get catalogId
   * @return catalogId
  */
  
  @Schema(name = "catalogId", required = false)
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public Catalog name(String name) {
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

  public Catalog rootCategories(List<Category> rootCategories) {
    this.rootCategories = rootCategories;
    return this;
  }

  public Catalog addRootCategoriesItem(Category rootCategoriesItem) {
    if (this.rootCategories == null) {
      this.rootCategories = new ArrayList<>();
    }
    this.rootCategories.add(rootCategoriesItem);
    return this;
  }

  /**
   * Get rootCategories
   * @return rootCategories
  */
  @Valid 
  @Schema(name = "rootCategories", example = "[]", required = false)
  public List<Category> getRootCategories() {
    return rootCategories;
  }

  public void setRootCategories(List<Category> rootCategories) {
    this.rootCategories = rootCategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.catalogId, catalog.catalogId) &&
        Objects.equals(this.name, catalog.name) &&
        Objects.equals(this.rootCategories, catalog.rootCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, name, rootCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootCategories: ").append(toIndentedString(rootCategories)).append("\n");
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

