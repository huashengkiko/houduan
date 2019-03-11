package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.SmcMarketingActivityConnect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SmcMarketingActivityConnectMapper extends BaseMapper<SmcMarketingActivityConnect> {

    List<SmcMarketingActivityConnect> findList(@Param("eo") SmcMarketingActivityConnect eo);

    int deleteByIds(String... pks);
}
