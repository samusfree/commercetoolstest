package com.e2x.kata.searchservice.delegate;

import com.e2x.kata.searchservice.model.QueryParams;
import com.e2x.kata.searchservice.model.SearchResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.searchservice.api.QueryApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.searchservice.api.QueryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class QueryApiDelegateImpl implements QueryApiDelegate {

    /**
     * @see com.e2x.kata.searchservice.api.QueryApi#searchByParams
     */
    @Override
    public ResponseEntity<SearchResult> searchByParams(QueryParams queryParams) {
        SearchResult result = new SearchResult();

        return new ResponseEntity<SearchResult>(result, HttpStatus.valueOf(200));
    }

}
