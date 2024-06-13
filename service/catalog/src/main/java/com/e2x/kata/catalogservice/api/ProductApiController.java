package com.e2x.kata.catalogservice.api;

import com.e2x.kata.catalogservice.model.Product;


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
@RequestMapping("${openapi.catalog.base-path:/v1}")
public class ProductApiController implements ProductApi {
    private final MeterRegistry registry;
    private Timer getProductByKeyTimer;

    private final ProductApiDelegate delegate;

    public ProductApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProductApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProductApiDelegate() {});
        this.registry = registry;
        getProductByKeyTimer = registry.timer("getProductByKeyTimer.http_requests", "method", "GET", "api.name", "getProductByKeyTimer");
    }

    @Override
    public ProductApiDelegate getDelegate() {
        return delegate;
    }

}
