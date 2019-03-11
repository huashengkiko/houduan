package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.Category;
import java.util.*;

public interface CategoryService {

    PageBean<Category> findPage(Category eo, Integer page, Integer size);

    List<Category> findAll(Category eo);

    Category detail(String pk);

    Boolean update(String pk, Category eo);

    Boolean create(Category eo);

    Boolean delete(String... pk);
}