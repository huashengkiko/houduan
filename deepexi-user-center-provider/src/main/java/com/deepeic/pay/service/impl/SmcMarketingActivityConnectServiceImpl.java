package com.deepeic.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepeic.pay.service.SmcMarketingActivityConnectService;
import com.deepeic.pay.domain.eo.SmcMarketingActivityConnect;
import com.deepeic.pay.extension.AppRuntimeEnv;
import com.deepeic.pay.mapper.SmcMarketingActivityConnectMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class SmcMarketingActivityConnectServiceImpl implements SmcMarketingActivityConnectService {

    private static final Logger logger = LoggerFactory.getLogger(SmcMarketingActivityConnectServiceImpl.class);

    @Autowired
    private SmcMarketingActivityConnectMapper smcMarketingActivityConnectMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(SmcMarketingActivityConnect eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SmcMarketingActivityConnect> list = smcMarketingActivityConnectMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<SmcMarketingActivityConnect> findAll(SmcMarketingActivityConnect eo) {
        List<SmcMarketingActivityConnect> list = smcMarketingActivityConnectMapper.findList(eo);
        return list;
    }
    @Override
    public SmcMarketingActivityConnect detail(String pk) {
        return smcMarketingActivityConnectMapper.selectById(pk);
    }

    @Override
    public Boolean create(SmcMarketingActivityConnect eo) {
        int result = smcMarketingActivityConnectMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,SmcMarketingActivityConnect eo) {
        eo.setId(pk);
        int result = smcMarketingActivityConnectMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = smcMarketingActivityConnectMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}