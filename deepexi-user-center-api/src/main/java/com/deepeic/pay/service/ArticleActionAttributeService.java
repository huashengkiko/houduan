package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.ArticleActionAttribute;
import java.util.*;

public interface ArticleActionAttributeService {

    PageBean<ArticleActionAttribute> findPage(ArticleActionAttribute eo, Integer page, Integer size);

    List<ArticleActionAttribute> findAll(ArticleActionAttribute eo);

    ArticleActionAttribute detail(String pk);

    Boolean update(String pk, ArticleActionAttribute eo);

    Boolean create(ArticleActionAttribute eo);

    Boolean delete(String... pk);
}