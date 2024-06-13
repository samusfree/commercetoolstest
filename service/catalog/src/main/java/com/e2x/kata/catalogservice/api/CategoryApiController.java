package com.e2x.kata.catalogservice.api;

import com.e2x.kata.catalogservice.model.Category;
import com.e2x.kata.catalogservice.model.CategoryList;


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
public class CategoryApiController implements CategoryApi {
    private final MeterRegistry registry;
    private Timer getCategoryBySlugTimer;
    private Timer getRootCategoriesTimer;

    private final CategoryApiDelegate delegate;

    public CategoryApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CategoryApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CategoryApiDelegate() {});
        this.registry = registry;
        getCategoryBySlugTimer = registry.timer("getCategoryBySlugTimer.http_requests", "method", "GET", "api.name", "getCategoryBySlugTimer");
        getRootCategoriesTimer = registry.timer("getRootCategoriesTimer.http_requests", "method", "GET", "api.name", "getRootCategoriesTimer");
    }

    @Override
    public CategoryApiDelegate getDelegate() {
        return delegate;
    }

}
