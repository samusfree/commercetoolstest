package com.e2x.kata.catalogservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.catalogservice.model.Catalog;
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
 * CatalogList
 */


public class CatalogList implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("catalogs")
  @Valid
  private List<Catalog> catalogs = null;

  public CatalogList catalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public CatalogList addCatalogsItem(Catalog catalogsItem) {
    if (this.catalogs == null) {
      this.catalogs = new ArrayList<>();
    }
    this.catalogs.add(catalogsItem);
    return this;
  }

  /**
   * Get catalogs
   * @return catalogs
  */
  @Valid 
  @Schema(name = "catalogs", example = "[]", required = false)
  public List<Catalog> getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogList catalogList = (CatalogList) o;
    return Objects.equals(this.catalogs, catalogList.catalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogList {\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
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

