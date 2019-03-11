package com.deepeic.pay.domain.dto;

import com.deepeic.pay.domain.eo.SuppplierCommodity;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc suppplier_commodity
 * @author admin
 */
public class SuppplierCommodityDto implements Serializable {
    private String id;

    private String commodityId;

    private String supplierId;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

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

