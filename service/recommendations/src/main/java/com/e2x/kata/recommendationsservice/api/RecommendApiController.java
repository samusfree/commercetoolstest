package com.e2x.kata.recommendationsservice.api;

import com.e2x.kata.recommendationsservice.model.Recommendations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;


@Controller
@RequestMapping("${openapi.recommendations.base-path:/v1}")
public class RecommendApiController implements RecommendApi {
    private final MeterRegistry registry;
    private Timer recommendTimer;

    private final RecommendApiDelegate delegate;

    public RecommendApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) RecommendApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RecommendApiDelegate() {});
        this.registry = registry;
        recommendTimer = registry.timer("recommendTimer.http_requests", "method", "GET", "api.name", "recommendTimer");
    }

    @Override
    public RecommendApiDelegate getDelegate() {
        return delegate;
    }

}
