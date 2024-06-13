package com.e2x.kata.basketservice.delegate;

import com.e2x.kata.basketservice.model.Address;
import com.e2x.kata.basketservice.model.Basket;
import com.e2x.kata.basketservice.model.CommerceItemId;
import com.e2x.kata.basketservice.model.CustomerEmail;
import com.e2x.kata.basketservice.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.basketservice.api.BasketApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.basketservice.api.BasketApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class BasketApiDelegateImpl implements BasketApiDelegate {

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#addToBasketByCustomerId
     */
    @Override
    public ResponseEntity<Basket> addToBasketByCustomerId(String customerId,
          Product product) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#getBasketByCustomerId
     */
    @Override
    public ResponseEntity<Basket> getBasketByCustomerId(String customerId) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#removeFromBasketByCustomerId
     */
    @Override
    public ResponseEntity<Basket> removeFromBasketByCustomerId(String customerId,
          CommerceItemId commerceItemId) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#setBillingAddressByCustomerId
     */
    @Override
    public ResponseEntity<Basket> setBillingAddressByCustomerId(String customerId,
          Address address) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#setEmailAddressByCustomerId
     */
    @Override
    public ResponseEntity<Basket> setEmailAddressByCustomerId(String customerId,
          CustomerEmail customerEmail) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.basketservice.api.BasketApi#setShippingAddressByCustomerId
     */
    @Override
    public ResponseEntity<Basket> setShippingAddressByCustomerId(String customerId,
          Address address) {
        Basket result = new Basket();

        return new ResponseEntity<Basket>(result, HttpStatus.valueOf(200));
    }

}
