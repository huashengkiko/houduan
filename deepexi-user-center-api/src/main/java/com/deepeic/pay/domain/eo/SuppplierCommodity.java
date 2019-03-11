package com.deepeic.pay.domain.eo;


import com.deepexi.util.mapper.SuperEntity;

import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc suppplier_commodity
 * @author admin
 */
//@ApiModel(description = "suppplier_commodity")
public class SuppplierCommodity implements Serializable{

    //@ApiModelProperty(value = "")
    private String id;

    //@ApiModelProperty(value = "")
    private String commodityId;

    //@ApiModelProperty(value = "")
    private String supplierId;

    //@ApiModelProperty(value = "")
    private Date createdAt;

    //@ApiModelProperty(value = "")
    private String createdBy;

    //@ApiModelProperty(value = "")
    private Date updatedAt;

    //@ApiModelProperty(value = "")
    private String updatedBy;

    //@ApiModelProperty(value = "")
    private Boolean dr;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setCommodityId(String commodityId){
        this.commodityId = commodityId;
    }

    public String getCommodityId(){
        return this.commodityId;
    }

    public void setSupplierId(String supplierId){
        this.supplierId = supplierId;
    }

    public String getSupplierId(){
        return this.supplierId;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return this.createdAt;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public String getCreatedBy(){
        return this.createdBy;
    }

    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
        return this.updatedAt;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
        return this.updatedBy;
    }

    public void setDr(Boolean dr){
        this.dr = dr;
    }

    public Boolean getDr(){
        return this.dr;
    }


}

