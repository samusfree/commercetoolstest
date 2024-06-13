package com.e2x.kata.searchservice.api;

import com.e2x.kata.searchservice.model.QueryParams;
import com.e2x.kata.searchservice.model.SearchResult;
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
 * A delegate to be called by the {@link QueryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface QueryApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /query : Search for products
     * Returns search results
     *
     * @param queryParams Search query parameters (required)
     * @return successful operation (status code 200)
     *         or Invalid search parameters (status code 400)
     * @see QueryApi#searchByParams
     */
    default ResponseEntity<SearchResult> searchByParams(QueryParams queryParams) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 6, \"offset\" : 5, \"query\" : { \"offset\" : 0, \"limit\" : 282, \"language\" : \"language\", \"text\" : \"text\", \"filters\" : [ \"filters\", \"filters\" ], \"sort\" : \"NONE\", \"facets\" : [ \"facets\", \"facets\" ], \"order\" : \"DESC\" }, \"count\" : 0, \"limit\" : 1, \"results\" : [ ], \"facetResults\" : [ ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
