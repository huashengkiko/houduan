package com.deepeic.pay.domain.dto;

import com.deepeic.pay.domain.eo.ArticleContent;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc article_content
 * @author admin
 */
public class ArticleContentDto implements Serializable {
    private String id;

    private String tenantId;

    private String articleId;

    private String wechatPublistNo;

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

