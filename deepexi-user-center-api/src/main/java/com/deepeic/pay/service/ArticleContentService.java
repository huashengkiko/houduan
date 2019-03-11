package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.ArticleContent;
import java.util.*;

public interface ArticleContentService {

    PageBean<ArticleContent> findPage(ArticleContent eo, Integer page, Integer size);

    List<ArticleContent> findAll(ArticleContent eo);

    ArticleContent detail(String pk);

    Boolean update(String pk, ArticleContent eo);

    Boolean create(ArticleContent eo);

    Boolean delete(String... pk);
}