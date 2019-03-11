package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.ArticleActionAttribute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleActionAttributeMapper extends BaseMapper<ArticleActionAttribute> {

    List<ArticleActionAttribute> findList(@Param("eo") ArticleActionAttribute eo);

    int deleteByIds(String... pks);
}
