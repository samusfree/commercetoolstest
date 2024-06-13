package com.e2x.kata.recommendationsservice.delegate;

import com.e2x.kata.recommendationsservice.model.Recommendations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.recommendationsservice.api.RecommendApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.recommendationsservice.api.RecommendApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class RecommendApiDelegateImpl implements RecommendApiDelegate {

    /**
     * @see com.e2x.kata.recommendationsservice.api.RecommendApi#recommend
     */
    @Override
    public ResponseEntity<Recommendations> recommend() {
        Recommendations result = new Recommendations();

        return new ResponseEntity<Recommendations>(result, HttpStatus.valueOf(200));
    }

}
