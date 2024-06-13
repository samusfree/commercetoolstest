package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.catalogservice.api.ProductApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.catalogservice.api.ProductApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class ProductApiDelegateImpl implements ProductApiDelegate {

    /**
     * @see com.e2x.kata.catalogservice.api.ProductApi#getProductByKey
     */
    @Override
    public ResponseEntity<Product> getProductByKey(String productKey) {
        Product result = new Product();

        return new ResponseEntity<Product>(result, HttpStatus.valueOf(200));
    }

}
