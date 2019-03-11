package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.SuppplierCommodityService;
import com.deepeic.pay.domain.eo.SuppplierCommodity;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.SuppplierCommodityMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class SuppplierCommodityServiceImpl implements SuppplierCommodityService {

    private static final Logger logger = LoggerFactory.getLogger(SuppplierCommodityServiceImpl.class);

    @Autowired
    private SuppplierCommodityMapper suppplierCommodityMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(SuppplierCommodity eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SuppplierCommodity> list = suppplierCommodityMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<SuppplierCommodity> findAll(SuppplierCommodity eo) {
        List<SuppplierCommodity> list = suppplierCommodityMapper.findList(eo);
        return list;
    }
    @Override
    public SuppplierCommodity detail(String pk) {
        return suppplierCommodityMapper.selectById(pk);
    }

    @Override
    public Boolean create(SuppplierCommodity eo) {
        int result = suppplierCommodityMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,SuppplierCommodity eo) {
        eo.setId(pk);
        int result = suppplierCommodityMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = suppplierCommodityMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}