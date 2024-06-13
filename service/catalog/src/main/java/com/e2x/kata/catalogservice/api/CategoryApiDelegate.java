package com.e2x.kata.catalogservice.api;

import com.e2x.kata.catalogservice.model.Category;
import com.e2x.kata.catalogservice.model.CategoryList;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link CategoryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface CategoryApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /category/{seoSlug} : Find category by looking up the SEO Slug
     * Returns a single category
     *
     * @param seoSlug seoSlug of category to return (required)
     * @return successful operation (status code 200)
     *         or Invalid seoSlug supplied (status code 400)
     *         or Category not found (status code 404)
     * @see CategoryApi#getCategoryBySlug
     */
    default ResponseEntity<Category> getCategoryBySlug(String seoSlug) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"catalog\" : { \"catalogId\" : \"catalogId\", \"name\" : \"name\", \"rootCategories\" : [ ] }, \"name\" : \"name\", \"categoryId\" : \"categoryId\", \"key\" : \"key\", \"slug\" : \"slug\", \"subCategories\" : { \"categories\" : [ ] }, \"products\" : { \"products\" : [ ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /category : Find the root categories
     * Returns the root categories
     *
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Category not found (status code 404)
     * @see CategoryApi#getRootCategories
     */
    default ResponseEntity<CategoryList> getRootCategories() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"categories\" : [ ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
