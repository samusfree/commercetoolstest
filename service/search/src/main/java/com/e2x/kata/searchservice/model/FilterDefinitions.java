package com.e2x.kata.searchservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.searchservice.model.FilterDefinition;
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
 * FilterDefinitions
 */


public class FilterDefinitions implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("categories")
  @Valid
  private List<FilterDefinition> categories = null;

  @JsonProperty("facets")
  @Valid
  private List<FilterDefinition> facets = null;

  public FilterDefinitions categories(List<FilterDefinition> categories) {
    this.categories = categories;
    return this;
  }

  public FilterDefinitions addCategoriesItem(FilterDefinition categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", required = false)
  public List<FilterDefinition> getCategories() {
    return categories;
  }

  public void setCategories(List<FilterDefinition> categories) {
    this.categories = categories;
  }

  public FilterDefinitions facets(List<FilterDefinition> facets) {
    this.facets = facets;
    return this;
  }

  public FilterDefinitions addFacetsItem(FilterDefinition facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * Get facets
   * @return facets
  */
  @Valid 
  @Schema(name = "facets", required = false)
  public List<FilterDefinition> getFacets() {
    return facets;
  }

  public void setFacets(List<FilterDefinition> facets) {
    this.facets = facets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDefinitions filterDefinitions = (FilterDefinitions) o;
    return Objects.equals(this.categories, filterDefinitions.categories) &&
        Objects.equals(this.facets, filterDefinitions.facets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, facets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDefinitions {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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

