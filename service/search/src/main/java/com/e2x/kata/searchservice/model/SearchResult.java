package com.e2x.kata.searchservice.model;

import java.net.URI;
import java.util.Objects;
import com.e2x.kata.searchservice.model.Facet;
import com.e2x.kata.searchservice.model.Product;
import com.e2x.kata.searchservice.model.QueryParams;
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
 * SearchResult
 */


public class SearchResult implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("results")
  @Valid
  private List<Product> results = null;

  @JsonProperty("facetResults")
  @Valid
  private List<Facet> facetResults = null;

  @JsonProperty("query")
  private QueryParams query;

  public SearchResult count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "count", required = false)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SearchResult total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  
  @Schema(name = "total", required = false)
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SearchResult limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  
  @Schema(name = "limit", required = false)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SearchResult offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", required = false)
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public SearchResult results(List<Product> results) {
    this.results = results;
    return this;
  }

  public SearchResult addResultsItem(Product resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @Valid 
  @Schema(name = "results", example = "[]", required = false)
  public List<Product> getResults() {
    return results;
  }

  public void setResults(List<Product> results) {
    this.results = results;
  }

  public SearchResult facetResults(List<Facet> facetResults) {
    this.facetResults = facetResults;
    return this;
  }

  public SearchResult addFacetResultsItem(Facet facetResultsItem) {
    if (this.facetResults == null) {
      this.facetResults = new ArrayList<>();
    }
    this.facetResults.add(facetResultsItem);
    return this;
  }

  /**
   * Get facetResults
   * @return facetResults
  */
  @Valid 
  @Schema(name = "facetResults", example = "[]", required = false)
  public List<Facet> getFacetResults() {
    return facetResults;
  }

  public void setFacetResults(List<Facet> facetResults) {
    this.facetResults = facetResults;
  }

  public SearchResult query(QueryParams query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
  @Valid 
  @Schema(name = "query", required = false)
  public QueryParams getQuery() {
    return query;
  }

  public void setQuery(QueryParams query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.count, searchResult.count) &&
        Objects.equals(this.total, searchResult.total) &&
        Objects.equals(this.limit, searchResult.limit) &&
        Objects.equals(this.offset, searchResult.offset) &&
        Objects.equals(this.results, searchResult.results) &&
        Objects.equals(this.facetResults, searchResult.facetResults) &&
        Objects.equals(this.query, searchResult.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, total, limit, offset, results, facetResults, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    facetResults: ").append(toIndentedString(facetResults)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

