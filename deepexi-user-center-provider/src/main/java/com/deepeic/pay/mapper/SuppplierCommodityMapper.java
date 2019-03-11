package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.SuppplierCommodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SuppplierCommodityMapper extends BaseMapper<SuppplierCommodity> {

    List<SuppplierCommodity> findList(@Param("eo") SuppplierCommodity eo);

    int deleteByIds(String... pks);
}
