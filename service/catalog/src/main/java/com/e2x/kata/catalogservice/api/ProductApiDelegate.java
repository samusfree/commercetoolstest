package com.e2x.kata.catalogservice.api;

import com.e2x.kata.catalogservice.model.Product;
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
 * A delegate to be called by the {@link ProductApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface ProductApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /product/{productKey} : Find product by Key
     * Returns a single product
     *
     * @param productKey Key of product to return (required)
     * @return successful operation (status code 200)
     *         or Invalid Key supplied (status code 400)
     *         or Product not found (status code 404)
     * @see ProductApi#getProductByKey
     */
    default ResponseEntity<Product> getProductByKey(String productKey) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"images\" : [ ], \"masterPrice\" : { \"totalPrice\" : 0.0, \"currency\" : \"AED\" }, \"productId\" : \"productId\", \"name\" : \"name\", \"rating\" : 0, \"description\" : \"description\", \"parentCategory\" : { \"catalog\" : { \"catalogId\" : \"catalogId\", \"name\" : \"name\", \"rootCategories\" : [ ] }, \"name\" : \"name\", \"categoryId\" : \"categoryId\", \"key\" : \"key\", \"slug\" : \"slug\", \"subCategories\" : { \"categories\" : [ ] }, \"products\" : { \"products\" : [ ] } }, \"categories\" : { \"categories\" : [ ] }, \"variants\" : { \"variants\" : [ ] }, \"key\" : \"key\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
