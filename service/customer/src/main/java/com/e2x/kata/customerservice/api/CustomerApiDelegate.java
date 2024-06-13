package com.e2x.kata.customerservice.api;

import com.e2x.kata.customerservice.model.Customer;
import com.e2x.kata.customerservice.model.LoginDetails;
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
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /customer/{customerId} : Deletes a customer by their customer ID
     * Deletes a customer by their customer ID
     *
     * @param customerId  (required)
     * @return Success (status code 200)
     *         or User does not exist (status code 404)
     * @see CustomerApi#deleteByCustomerId
     */
    default ResponseEntity<Customer> deleteByCustomerId(String customerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"address\" : { \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"nameOfResident\" : \"nameOfResident\", \"addressType\" : \"HOME\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"loginDetails\" : { \"password\" : \"password\", \"username\" : \"username\" }, \"customerId\" : \"customerId\", \"name\" : \"name\", \"shippingSame\" : true, \"billingSame\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customer : Gets a customer by email address
     * Get a customer by email address
     *
     * @param emailAddress  (required)
     * @return Success (status code 200)
     *         or User does not exist (status code 404)
     * @see CustomerApi#getCustomerByEmail
     */
    default ResponseEntity<Customer> getCustomerByEmail(String emailAddress) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"address\" : { \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"nameOfResident\" : \"nameOfResident\", \"addressType\" : \"HOME\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"loginDetails\" : { \"password\" : \"password\", \"username\" : \"username\" }, \"customerId\" : \"customerId\", \"name\" : \"name\", \"shippingSame\" : true, \"billingSame\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /customer/login : Logs the customer into the system
     * Logs a customer in using their username, an email, and their password.
     *
     * @param loginDetails Optional description in *Markdown* (required)
     * @return Success (status code 200)
     * @see CustomerApi#loginCustomer
     */
    default ResponseEntity<Customer> loginCustomer(LoginDetails loginDetails) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"address\" : { \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"nameOfResident\" : \"nameOfResident\", \"addressType\" : \"HOME\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"loginDetails\" : { \"password\" : \"password\", \"username\" : \"username\" }, \"customerId\" : \"customerId\", \"name\" : \"name\", \"shippingSame\" : true, \"billingSame\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /customer : Registers a new customer into the system
     * Registers a new customer with the system.
     *
     * @param customer The Customer being registered (required)
     * @return Success (status code 200)
     * @see CustomerApi#register
     */
    default ResponseEntity<Customer> register(Customer customer) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"basketId\" : \"basketId\", \"address\" : { \"line4\" : \"line4\", \"phoneNumber\" : \"phoneNumber\", \"nameOfResident\" : \"nameOfResident\", \"addressType\" : \"HOME\", \"postcode\" : \"postcode\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\", \"addressId\" : \"addressId\" }, \"loginDetails\" : { \"password\" : \"password\", \"username\" : \"username\" }, \"customerId\" : \"customerId\", \"name\" : \"name\", \"shippingSame\" : true, \"billingSame\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
