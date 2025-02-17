/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.e2x.kata.recommendationsservice.api;

import com.e2x.kata.recommendationsservice.model.Recommendations;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;


@Validated
@Api(value = "recommend", description = "the recommend API")
public interface RecommendApi {

    default RecommendApiDelegate getDelegate() {
        return new RecommendApiDelegate() {};
    }

    /**
     * POST /recommend : Recommend products
     * Returns recommendations
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "recommend",
        summary = "Recommend products",
        tags = { "recommend" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Recommendations.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/recommend",
        produces = { "application/json" }
    )
    default ResponseEntity<Recommendations> recommend(
        
    ) {
        Counter recommendCounter = Metrics.counter("RecommendApi.recommend");
        recommendCounter.increment();
        return getDelegate().recommend();
    }

}
