package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.HospitalSupplier;
import java.util.*;

public interface HospitalSupplierService {

    PageBean<HospitalSupplier> findPage(HospitalSupplier eo, Integer page, Integer size);

    List<HospitalSupplier> findAll(HospitalSupplier eo);

    HospitalSupplier detail(Integer  pk);

    Boolean update(Integer  pk, HospitalSupplier eo);

    Boolean create(HospitalSupplier eo);

    Boolean delete(Integer ... pk);
}