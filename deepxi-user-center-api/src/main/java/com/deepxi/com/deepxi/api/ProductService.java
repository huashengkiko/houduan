package com.deepxi.com.deepxi.api;

import com.deepxi.com.deepxi.domain.eo.Product;

public interface ProductService {

    Object getProductList();

    Object getProductById(Integer id);

    Object createProduct(Product product);

    Object deleteProductById(Integer id);

}
