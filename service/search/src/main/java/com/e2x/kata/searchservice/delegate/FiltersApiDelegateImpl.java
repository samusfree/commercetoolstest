package com.e2x.kata.searchservice.delegate;

import com.e2x.kata.searchservice.model.FilterDefinitions;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.searchservice.api.FiltersApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.searchservice.api.FiltersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class FiltersApiDelegateImpl implements FiltersApiDelegate {

    /**
     * @see com.e2x.kata.searchservice.api.FiltersApi#retrieveFilters
     */
    @Override
    public ResponseEntity<FilterDefinitions> retrieveFilters(String language) {
        FilterDefinitions result = new FilterDefinitions();

        return new ResponseEntity<FilterDefinitions>(result, HttpStatus.valueOf(200));
    }

}
