package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.ArticleActionAttributeService;
import com.deepeic.pay.domain.eo.ArticleActionAttribute;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.ArticleActionAttributeMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class ArticleActionAttributeServiceImpl implements ArticleActionAttributeService {

    private static final Logger logger = LoggerFactory.getLogger(ArticleActionAttributeServiceImpl.class);

    @Autowired
    private ArticleActionAttributeMapper articleActionAttributeMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(ArticleActionAttribute eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ArticleActionAttribute> list = articleActionAttributeMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<ArticleActionAttribute> findAll(ArticleActionAttribute eo) {
        List<ArticleActionAttribute> list = articleActionAttributeMapper.findList(eo);
        return list;
    }
    @Override
    public ArticleActionAttribute detail(String pk) {
        return articleActionAttributeMapper.selectById(pk);
    }

    @Override
    public Boolean create(ArticleActionAttribute eo) {
        int result = articleActionAttributeMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,ArticleActionAttribute eo) {
        eo.setId(pk);
        int result = articleActionAttributeMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = articleActionAttributeMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}