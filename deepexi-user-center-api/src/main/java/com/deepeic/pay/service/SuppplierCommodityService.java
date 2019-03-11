package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.SuppplierCommodity;
import java.util.*;

public interface SuppplierCommodityService {

    PageBean<SuppplierCommodity> findPage(SuppplierCommodity eo, Integer page, Integer size);

    List<SuppplierCommodity> findAll(SuppplierCommodity eo);

    SuppplierCommodity detail(String pk);

    Boolean update(String pk, SuppplierCommodity eo);

    Boolean create(SuppplierCommodity eo);

    Boolean delete(String... pk);
}