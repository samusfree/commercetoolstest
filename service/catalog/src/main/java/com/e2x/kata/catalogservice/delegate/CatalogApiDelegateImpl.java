package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Catalog;
import com.e2x.kata.catalogservice.model.CatalogList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.catalogservice.api.CatalogApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.catalogservice.api.CatalogApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class CatalogApiDelegateImpl implements CatalogApiDelegate {

    /**
     * @see com.e2x.kata.catalogservice.api.CatalogApi#getCatalogById
     */
    @Override
    public ResponseEntity<Catalog> getCatalogById(String catalogId) {
        Catalog result = new Catalog();

        return new ResponseEntity<Catalog>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.catalogservice.api.CatalogApi#getCatalogs
     */
    @Override
    public ResponseEntity<CatalogList> getCatalogs() {
        CatalogList result = new CatalogList();

        return new ResponseEntity<CatalogList>(result, HttpStatus.valueOf(200));
    }

}
