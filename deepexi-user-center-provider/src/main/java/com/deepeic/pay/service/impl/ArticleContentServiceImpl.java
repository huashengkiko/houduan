package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.ArticleContentService;
import com.deepeic.pay.domain.eo.ArticleContent;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.ArticleContentMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class ArticleContentServiceImpl implements ArticleContentService {

    private static final Logger logger = LoggerFactory.getLogger(ArticleContentServiceImpl.class);

    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(ArticleContent eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ArticleContent> list = articleContentMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<ArticleContent> findAll(ArticleContent eo) {
        List<ArticleContent> list = articleContentMapper.findList(eo);
        return list;
    }
    @Override
    public ArticleContent detail(String pk) {
        return articleContentMapper.selectById(pk);
    }

    @Override
    public Boolean create(ArticleContent eo) {
        int result = articleContentMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,ArticleContent eo) {
        eo.setId(pk);
        int result = articleContentMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = articleContentMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}