package com.e2x.kata.customerservice.delegate;

import com.e2x.kata.customerservice.model.Customer;
import com.e2x.kata.customerservice.model.LoginDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.customerservice.api.CustomerApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.customerservice.api.CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class CustomerApiDelegateImpl implements CustomerApiDelegate {

    /**
     * @see com.e2x.kata.customerservice.api.CustomerApi#deleteByCustomerId
     */
    @Override
    public ResponseEntity<Customer> deleteByCustomerId(String customerId) {
        Customer result = new Customer();

        return new ResponseEntity<Customer>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.customerservice.api.CustomerApi#getCustomerByEmail
     */
    @Override
    public ResponseEntity<Customer> getCustomerByEmail(String emailAddress) {
        Customer result = new Customer();

        return new ResponseEntity<Customer>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.customerservice.api.CustomerApi#loginCustomer
     */
    @Override
    public ResponseEntity<Customer> loginCustomer(LoginDetails loginDetails) {
        Customer result = new Customer();

        return new ResponseEntity<Customer>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.customerservice.api.CustomerApi#register
     */
    @Override
    public ResponseEntity<Customer> register(Customer customer) {
        Customer result = new Customer();

        return new ResponseEntity<Customer>(result, HttpStatus.valueOf(200));
    }

}
