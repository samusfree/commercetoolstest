package com.e2x.kata.basketservice.api;

import com.e2x.kata.basketservice.model.Address;
import com.e2x.kata.basketservice.model.Basket;
import com.e2x.kata.basketservice.model.CommerceItemId;
import com.e2x.kata.basketservice.model.CustomerEmail;
import com.e2x.kata.basketservice.model.Product;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link BasketApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface BasketApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /basket/{customerId}/add : Add item to basket
     * Adds a single item to the basket.
     *
     * @param customerId Owner of the basket to add an item to (required)
     * @param product The commerceitem being added (required)
     * @return Success (status code 200)
     * @see BasketApi#addToBasketByCustomerId
     */
    default ResponseEntity<Basket> addToBasketByCustomerId(String customerId,
        Product product) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /basket/{customerId} : Retrieve the current basket for the specified customer
     * Retrieves the referenced basket for the current user.
     *
     * @param customerId ID of customer for whose basket to return (required)
     * @return Success (status code 200)
     * @see BasketApi#getBasketByCustomerId
     */
    default ResponseEntity<Basket> getBasketByCustomerId(String customerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /basket/{customerId}/remove : Remove item from basket
     * Removes a single item from the basket.
     *
     * @param customerId Owner of the basket to add an item to (required)
     * @param commerceItemId The identifier of the commerceitem being remove (required)
     * @return Success (status code 200)
     * @see BasketApi#removeFromBasketByCustomerId
     */
    default ResponseEntity<Basket> removeFromBasketByCustomerId(String customerId,
        CommerceItemId commerceItemId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /basket/{customerId}/billing-address : Set billing address on basket
     * Sets the billing address on the basket.
     *
     * @param customerId Owner of the basket (required)
     * @param address The billing address being added (required)
     * @return Success (status code 200)
     *         or Billing address not valid (status code 400)
     *         or Basket does not exist (status code 404)
     * @see BasketApi#setBillingAddressByCustomerId
     */
    default ResponseEntity<Basket> setBillingAddressByCustomerId(String customerId,
        Address address) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /basket/{customerId}/email : Set email address on basket
     * Sets the email address on the basket.
     *
     * @param customerId Owner of the basket (required)
     * @param customerEmail The email address being added (required)
     * @return Success (status code 200)
     *         or Email address not valid (status code 400)
     *         or Basket does not exist (status code 404)
     * @see BasketApi#setEmailAddressByCustomerId
     */
    default ResponseEntity<Basket> setEmailAddressByCustomerId(String customerId,
        CustomerEmail customerEmail) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /basket/{customerId}/shipping-address : Set shipping address on basket
     * Sets the shipping address on the basket.
     *
     * @param customerId Owner of the basket (required)
     * @param address The shipping address being added (required)
     * @return Success (status code 200)
     *         or Shipping address not valid (status code 400)
     *         or Basket does not exist (status code 404)
     * @see BasketApi#setShippingAddressByCustomerId
     */
    default ResponseEntity<Basket> setShippingAddressByCustomerId(String customerId,
        Address address) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"anonCustomerId\" : \"anonCustomerId\", \"numberOfItems\" : 0, \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"customerEmail\" : \"customerEmail\", \"shippingInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"shippingInfoId\" : \"shippingInfoId\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"customerId\" : \"customerId\", \"paymentInfo\" : { \"address\" : { \"country\" : \"AC\", \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"name\" : \"name\", \"paymentPayload\" : \"paymentPayload\", \"paymentInfoId\" : \"paymentInfoId\", \"paymentType\" : \"paymentType\", \"commerceItems\" : [ { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" }, { \"commerceItemId\" : \"commerceItemId\", \"productImage\" : \"productImage\", \"quantity\" : 5, \"productId\" : \"productId\", \"price\" : { \"totalPrice\" : 0.6027456183070403, \"currency\" : \"AED\" }, \"name\" : \"name\", \"variantId\" : 1, \"productSlug\" : \"productSlug\" } ] }, \"commerceItems\" : [ ], \"customer\" : { \"customerId\" : \"customerId\", \"name\" : \"name\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
