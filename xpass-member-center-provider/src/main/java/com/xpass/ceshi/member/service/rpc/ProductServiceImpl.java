package com.xpass.ceshi.member.service.rpc;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.xpass.ceshi.member.api.ProductService;
import com.xpass.ceshi.member.domain.eo.Product;
import com.xpass.ceshi.member.mapper.ProductMapper;
import com.xpass.ceshi.member.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@HSFProvider(serviceInterface = ProductService.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public Object getProductList() {
        return productRepository.findAll();
    }

    public Object createProduct(Product product) {
        return productRepository.save(product);
    }

    public Object deleteProductById(Integer id) {
        productRepository.delete(id);
        return true;
    }

    public Object getProductById(Integer id) {
        return productMapper.getById(id);
    }
}