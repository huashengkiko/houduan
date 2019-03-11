package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.CategoryService;
import com.deepeic.pay.domain.eo.Category;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.CategoryMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class CategoryServiceImpl implements CategoryService {

    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(Category eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Category> list = categoryMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<Category> findAll(Category eo) {
        List<Category> list = categoryMapper.findList(eo);
        return list;
    }
    @Override
    public Category detail(String pk) {
        return categoryMapper.selectById(pk);
    }

    @Override
    public Boolean create(Category eo) {
        int result = categoryMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,Category eo) {
        eo.setId(pk);
        int result = categoryMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = categoryMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}