package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> findList(@Param("eo") Category eo);

    int deleteByIds(String... pks);
}
