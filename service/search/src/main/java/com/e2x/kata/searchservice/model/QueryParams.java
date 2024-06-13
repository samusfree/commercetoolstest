package com.e2x.kata.searchservice.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * QueryParams
 */


public class QueryParams implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("text")
  private String text;

  @JsonProperty("language")
  private String language;

  @JsonProperty("facets")
  @Valid
  private List<String> facets = null;

  @JsonProperty("filters")
  @Valid
  private List<String> filters = null;

  @JsonProperty("limit")
  private Integer limit = 500;

  @JsonProperty("offset")
  private Integer offset = 0;

  /**
   * How to sort results
   */
  public enum SortEnum {
    NONE("NONE"),
    
    PRICE("PRICE"),
    
    NAME("NAME"),
    
    CREATED("CREATED"),
    
    MODIFIED("MODIFIED"),
    
    ID("ID"),
    
    SCORE("SCORE");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sort")
  private SortEnum sort = SortEnum.NONE;

  /**
   * Order of sorting
   */
  public enum OrderEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("order")
  private OrderEnum order = OrderEnum.DESC;

  public QueryParams text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text to search for
   * @return text
  */
  
  @Schema(name = "text", description = "Text to search for", required = false)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public QueryParams language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language to search
   * @return language
  */
  @NotNull 
  @Schema(name = "language", description = "Language to search", required = true)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public QueryParams facets(List<String> facets) {
    this.facets = facets;
    return this;
  }

  public QueryParams addFacetsItem(String facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * Facets to report
   * @return facets
  */
  
  @Schema(name = "facets", description = "Facets to report", required = false)
  public List<String> getFacets() {
    return facets;
  }

  public void setFacets(List<String> facets) {
    this.facets = facets;
  }

  public QueryParams filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public QueryParams addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters to apply to results and facets
   * @return filters
  */
  
  @Schema(name = "filters", description = "Filters to apply to results and facets", required = false)
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public QueryParams limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Limit number of results
   * minimum: 1
   * maximum: 500
   * @return limit
  */
  @Min(1) @Max(500) 
  @Schema(name = "limit", description = "Limit number of results", required = false)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public QueryParams offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Offset for start of results
   * minimum: 0
   * @return offset
  */
  @Min(0) 
  @Schema(name = "offset", description = "Offset for start of results", required = false)
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public QueryParams sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * How to sort results
   * @return sort
  */
  
  @Schema(name = "sort", description = "How to sort results", required = false)
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public QueryParams order(OrderEnum order) {
    this.order = order;
    return this;
  }

  /**
   * Order of sorting
   * @return order
  */
  
  @Schema(name = "order", description = "Order of sorting", required = false)
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryParams queryParams = (QueryParams) o;
    return Objects.equals(this.text, queryParams.text) &&
        Objects.equals(this.language, queryParams.language) &&
        Objects.equals(this.facets, queryParams.facets) &&
        Objects.equals(this.filters, queryParams.filters) &&
        Objects.equals(this.limit, queryParams.limit) &&
        Objects.equals(this.offset, queryParams.offset) &&
        Objects.equals(this.sort, queryParams.sort) &&
        Objects.equals(this.order, queryParams.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, facets, filters, limit, offset, sort, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParams {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

