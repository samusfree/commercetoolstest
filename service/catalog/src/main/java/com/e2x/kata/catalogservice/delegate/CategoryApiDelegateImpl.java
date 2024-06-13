package com.e2x.kata.catalogservice.delegate;

import com.e2x.kata.catalogservice.model.Category;
import com.e2x.kata.catalogservice.model.CategoryList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.e2x.kata.catalogservice.api.CategoryApiDelegate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link com.e2x.kata.catalogservice.api.CategoryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
public class CategoryApiDelegateImpl implements CategoryApiDelegate {

    /**
     * @see com.e2x.kata.catalogservice.api.CategoryApi#getCategoryBySlug
     */
    @Override
    public ResponseEntity<Category> getCategoryBySlug(String seoSlug) {
        Category result = new Category();

        return new ResponseEntity<Category>(result, HttpStatus.valueOf(200));
    }

    /**
     * @see com.e2x.kata.catalogservice.api.CategoryApi#getRootCategories
     */
    @Override
    public ResponseEntity<CategoryList> getRootCategories() {
        CategoryList result = new CategoryList();

        return new ResponseEntity<CategoryList>(result, HttpStatus.valueOf(200));
    }

}
