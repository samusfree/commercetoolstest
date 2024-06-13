package com.e2x.kata.catalogservice.model;

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
 * Image
 */


public class Image implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("imageLabel")
  private String imageLabel;

  @JsonProperty("url")
  private String url;

  public Image imageLabel(String imageLabel) {
    this.imageLabel = imageLabel;
    return this;
  }

  /**
   * Get imageLabel
   * @return imageLabel
  */
  
  @Schema(name = "imageLabel", required = false)
  public String getImageLabel() {
    return imageLabel;
  }

  public void setImageLabel(String imageLabel) {
    this.imageLabel = imageLabel;
  }

  public Image url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", required = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.imageLabel, image.imageLabel) &&
        Objects.equals(this.url, image.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageLabel, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    imageLabel: ").append(toIndentedString(imageLabel)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

