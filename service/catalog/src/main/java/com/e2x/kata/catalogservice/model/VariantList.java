package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Variant;
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
 * VariantList
 */


public class VariantList implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("variants")
  @Valid
  private List<Variant> variants = null;

  public VariantList variants(List<Variant> variants) {
    this.variants = variants;
    return this;
  }

  public VariantList addVariantsItem(Variant variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    return this;
  }

  /**
   * Get variants
   * @return variants
  */
  @Valid 
  @Schema(name = "variants", example = "[]", required = false)
  public List<Variant> getVariants() {
    return variants;
  }

  public void setVariants(List<Variant> variants) {
    this.variants = variants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantList variantList = (VariantList) o;
    return Objects.equals(this.variants, variantList.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantList {\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

