package com.deepexi.com.deepexo.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepexi.com.deepexo.domain.eo.Product;

public interface ProductService {

    PageBean getProductList(Integer page, Integer size, Integer price);

    Product getProductById(String id);

    Integer createProduct(Product product);

    Boolean deleteProductById(String id);

    void testError();
}
