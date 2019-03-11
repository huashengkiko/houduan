package com.deepeic.pay.domain.eo;


import com.deepexi.util.mapper.SuperEntity;

import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc article_content
 * @author admin
 */
//@ApiModel(description = "article_content")
public class ArticleContent implements Serializable{

    //@ApiModelProperty(value = "id")
    private String id;

    //@ApiModelProperty(value = "租户id")
    private String tenantId;

    //@ApiModelProperty(value = "文章id")
    private String articleId;

    //@ApiModelProperty(value = "公众号id")
    private String wechatPublistNo;

    //@ApiModelProperty(value = "文章内容")
    private String content;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setTenantId(String tenantId){
        this.tenantId = tenantId;
    }

    public String getTenantId(){
        return this.tenantId;
    }

    public void setArticleId(String articleId){
        this.articleId = articleId;
    }

    public String getArticleId(){
        return this.articleId;
    }

    public void setWechatPublistNo(String wechatPublistNo){
        this.wechatPublistNo = wechatPublistNo;
    }

    public String getWechatPublistNo(){
        return this.wechatPublistNo;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }


}

