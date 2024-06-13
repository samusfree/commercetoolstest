package com.e2x.kata.basketservice.model;

import java.net.URI;
import java.util.Objects;
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
 * CommerceItemId
 */


public class CommerceItemId implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("commerceItemId")
  private String commerceItemId;

  public CommerceItemId commerceItemId(String commerceItemId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceItemId commerceItemId = (CommerceItemId) o;
    return Objects.equals(this.commerceItemId, commerceItemId.commerceItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceItemId {\n");
    sb.append("    commerceItemId: ").append(toIndentedString(commerceItemId)).append("\n");
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

