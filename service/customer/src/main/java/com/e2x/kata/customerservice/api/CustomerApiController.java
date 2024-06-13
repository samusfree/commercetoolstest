package com.e2x.kata.customerservice.api;

import com.e2x.kata.customerservice.model.Customer;
import com.e2x.kata.customerservice.model.LoginDetails;


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
@RequestMapping("${openapi.customer.base-path:/v1}")
public class CustomerApiController implements CustomerApi {
    private final MeterRegistry registry;
    private Timer deleteByCustomerIdTimer;
    private Timer getCustomerByEmailTimer;
    private Timer loginCustomerTimer;
    private Timer registerTimer;

    private final CustomerApiDelegate delegate;

    public CustomerApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CustomerApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CustomerApiDelegate() {});
        this.registry = registry;
        deleteByCustomerIdTimer = registry.timer("deleteByCustomerIdTimer.http_requests", "method", "GET", "api.name", "deleteByCustomerIdTimer");
        getCustomerByEmailTimer = registry.timer("getCustomerByEmailTimer.http_requests", "method", "GET", "api.name", "getCustomerByEmailTimer");
        loginCustomerTimer = registry.timer("loginCustomerTimer.http_requests", "method", "GET", "api.name", "loginCustomerTimer");
        registerTimer = registry.timer("registerTimer.http_requests", "method", "GET", "api.name", "registerTimer");
    }

    @Override
    public CustomerApiDelegate getDelegate() {
        return delegate;
    }

}
