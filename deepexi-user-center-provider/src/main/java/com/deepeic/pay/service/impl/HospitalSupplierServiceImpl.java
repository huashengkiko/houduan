package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.HospitalSupplierService;
import com.deepeic.pay.domain.eo.HospitalSupplier;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.HospitalSupplierMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class HospitalSupplierServiceImpl implements HospitalSupplierService {

    private static final Logger logger = LoggerFactory.getLogger(HospitalSupplierServiceImpl.class);

    @Autowired
    private HospitalSupplierMapper hospitalSupplierMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(HospitalSupplier eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HospitalSupplier> list = hospitalSupplierMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<HospitalSupplier> findAll(HospitalSupplier eo) {
        List<HospitalSupplier> list = hospitalSupplierMapper.findList(eo);
        return list;
    }
    @Override
    public HospitalSupplier detail(Integer  pk) {
        return hospitalSupplierMapper.selectById(pk);
    }

    @Override
    public Boolean create(HospitalSupplier eo) {
        int result = hospitalSupplierMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(Integer  pk,HospitalSupplier eo) {
        eo.setId(pk);
        int result = hospitalSupplierMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pk) {
        int result = hospitalSupplierMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}