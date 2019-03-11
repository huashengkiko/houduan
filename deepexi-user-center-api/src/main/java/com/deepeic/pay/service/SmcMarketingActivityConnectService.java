package com.deepeic.pay.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepeic.pay.domain.eo.SmcMarketingActivityConnect;
import java.util.*;

public interface SmcMarketingActivityConnectService {

    PageBean<SmcMarketingActivityConnect> findPage(SmcMarketingActivityConnect eo, Integer page, Integer size);

    List<SmcMarketingActivityConnect> findAll(SmcMarketingActivityConnect eo);

    SmcMarketingActivityConnect detail(String pk);

    Boolean update(String pk, SmcMarketingActivityConnect eo);

    Boolean create(SmcMarketingActivityConnect eo);

    Boolean delete(String... pk);
}