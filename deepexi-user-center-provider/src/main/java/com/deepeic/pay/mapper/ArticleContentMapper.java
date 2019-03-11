package com.deepeic.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepeic.pay.domain.eo.ArticleContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleContentMapper extends BaseMapper<ArticleContent> {

    List<ArticleContent> findList(@Param("eo") ArticleContent eo);

    int deleteByIds(String... pks);
}
