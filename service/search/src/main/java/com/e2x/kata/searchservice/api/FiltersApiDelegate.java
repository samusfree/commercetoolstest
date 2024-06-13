package com.e2x.kata.searchservice.api;

import com.e2x.kata.searchservice.model.FilterDefinitions;
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
 * A delegate to be called by the {@link FiltersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface FiltersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /filters/{language} : Retrieve filters for search
     * Retrieve filters for search
     *
     * @param language Language of filter definitions to retrieve (required)
     * @return successful operation (status code 200)
     * @see FiltersApi#retrieveFilters
     */
    default ResponseEntity<FilterDefinitions> retrieveFilters(String language) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"categories\" : [ { \"expression\" : \"expression\", \"label\" : \"label\" }, { \"expression\" : \"expression\", \"label\" : \"label\" } ], \"facets\" : [ { \"expression\" : \"expression\", \"label\" : \"label\" }, { \"expression\" : \"expression\", \"label\" : \"label\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
