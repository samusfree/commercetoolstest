package com.e2x.kata.basketservice.api;

import com.e2x.kata.basketservice.model.Address;
import com.e2x.kata.basketservice.model.Basket;
import com.e2x.kata.basketservice.model.CommerceItemId;
import com.e2x.kata.basketservice.model.CustomerEmail;
import com.e2x.kata.basketservice.model.Product;


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
@RequestMapping("${openapi.basket.base-path:/v1}")
public class BasketApiController implements BasketApi {
    private final MeterRegistry registry;
    private Timer addToBasketByCustomerIdTimer;
    private Timer getBasketByCustomerIdTimer;
    private Timer removeFromBasketByCustomerIdTimer;
    private Timer setBillingAddressByCustomerIdTimer;
    private Timer setEmailAddressByCustomerIdTimer;
    private Timer setShippingAddressByCustomerIdTimer;

    private final BasketApiDelegate delegate;

    public BasketApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BasketApiDelegate delegate,
        MeterRegistry registry) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BasketApiDelegate() {});
        this.registry = registry;
        addToBasketByCustomerIdTimer = registry.timer("addToBasketByCustomerIdTimer.http_requests", "method", "GET", "api.name", "addToBasketByCustomerIdTimer");
        getBasketByCustomerIdTimer = registry.timer("getBasketByCustomerIdTimer.http_requests", "method", "GET", "api.name", "getBasketByCustomerIdTimer");
        removeFromBasketByCustomerIdTimer = registry.timer("removeFromBasketByCustomerIdTimer.http_requests", "method", "GET", "api.name", "removeFromBasketByCustomerIdTimer");
        setBillingAddressByCustomerIdTimer = registry.timer("setBillingAddressByCustomerIdTimer.http_requests", "method", "GET", "api.name", "setBillingAddressByCustomerIdTimer");
        setEmailAddressByCustomerIdTimer = registry.timer("setEmailAddressByCustomerIdTimer.http_requests", "method", "GET", "api.name", "setEmailAddressByCustomerIdTimer");
        setShippingAddressByCustomerIdTimer = registry.timer("setShippingAddressByCustomerIdTimer.http_requests", "method", "GET", "api.name", "setShippingAddressByCustomerIdTimer");
    }

    @Override
    public BasketApiDelegate getDelegate() {
        return delegate;
    }

}
