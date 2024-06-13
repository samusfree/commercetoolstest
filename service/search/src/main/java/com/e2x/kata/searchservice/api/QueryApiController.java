package com.e2x.kata.searchservice.api;

import com.e2x.kata.searchservice.model.QueryParams;
import com.e2x.kata.searchservice.model.SearchResult;


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
@RequestMapping("${openapi.search.base-path:/v1}")
public class QueryApiController implements QueryApi {
    private final MeterRegistry registry;
    private Timer searchByParamsTimer;

    private final QueryApiDelegate delegate;

    public QueryApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) QueryApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new QueryApiDelegate() {});
        this.registry = registry;
        searchByParamsTimer = registry.timer("searchByParamsTimer.http_requests", "method", "GET", "api.name", "searchByParamsTimer");
    }

    @Override
    public QueryApiDelegate getDelegate() {
        return delegate;
    }

}
