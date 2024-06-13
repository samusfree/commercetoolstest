package com.e2x.kata.catalogservice.api;

import com.e2x.kata.catalogservice.model.Catalog;
import com.e2x.kata.catalogservice.model.CatalogList;


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
public class CatalogApiController implements CatalogApi {
    private final MeterRegistry registry;
    private Timer getCatalogByIdTimer;
    private Timer getCatalogsTimer;

    private final CatalogApiDelegate delegate;

    public CatalogApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CatalogApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CatalogApiDelegate() {});
        this.registry = registry;
        getCatalogByIdTimer = registry.timer("getCatalogByIdTimer.http_requests", "method", "GET", "api.name", "getCatalogByIdTimer");
        getCatalogsTimer = registry.timer("getCatalogsTimer.http_requests", "method", "GET", "api.name", "getCatalogsTimer");
    }

    @Override
    public CatalogApiDelegate getDelegate() {
        return delegate;
    }

}
