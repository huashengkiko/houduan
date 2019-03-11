package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.HospitalSupplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalSupplierMapper extends BaseMapper<HospitalSupplier> {

    List<HospitalSupplier> findList(@Param("eo") HospitalSupplier eo);

    int deleteByIds(Integer ... pks);
}
