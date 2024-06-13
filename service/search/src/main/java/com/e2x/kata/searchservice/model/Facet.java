package com.e2x.kata.searchservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.searchservice.model.FacetDetail;
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
 * Facet
 */


public class Facet implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("property")
  private String property;

  @JsonProperty("values")
  @Valid
  private List<FacetDetail> values = null;

  public Facet property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  
  @Schema(name = "property", required = false)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public Facet values(List<FacetDetail> values) {
    this.values = values;
    return this;
  }

  public Facet addValuesItem(FacetDetail valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @Valid 
  @Schema(name = "values", required = false)
  public List<FacetDetail> getValues() {
    return values;
  }

  public void setValues(List<FacetDetail> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facet facet = (Facet) o;
    return Objects.equals(this.property, facet.property) &&
        Objects.equals(this.values, facet.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facet {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

