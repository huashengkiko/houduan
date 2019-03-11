package com.deepeic.pay.domain.eo;


import com.deepexi.util.mapper.SuperEntity;

import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc hospital_supplier
 * @author admin
 */
//@ApiModel(description = "hospital_supplier")
public class HospitalSupplier implements Serializable{

    //@ApiModelProperty(value = "id")
    private Integer  id;

    //@ApiModelProperty(value = "医院id")
    private String hospital;

    //@ApiModelProperty(value = "供应商id")
    private Integer  supplierId;

    //@ApiModelProperty(value = "状态")
    private String status;

    //@ApiModelProperty(value = "审核意见")
    private String opinion;

    //@ApiModelProperty(value = "创建时间")
    private Date createdAt;

    //@ApiModelProperty(value = "创建人")
    private String createdBy;

    //@ApiModelProperty(value = "更新人")
    private Date updatedAt;

    //@ApiModelProperty(value = "更新人")
    private String updatedBy;

    //@ApiModelProperty(value = "逻辑删除")
    private Boolean dr;

    //@ApiModelProperty(value = "合同名称")
    private String contractName;

    //@ApiModelProperty(value = "合同编号")
    private String contractCode;

    //@ApiModelProperty(value = "合同附件")
    private String contractAttachmentUrl;

    //@ApiModelProperty(value = "有效期开始")
    private Date startTime;

    //@ApiModelProperty(value = "有效期结束")
    private Date endTiem;

    public void setId(Integer  id){
        this.id = id;
    }

    public Integer  getId(){
        return this.id;
    }

    public void setHospital(String hospital){
        this.hospital = hospital;
    }

    public String getHospital(){
        return this.hospital;
    }

    public void setSupplierId(Integer  supplierId){
        this.supplierId = supplierId;
    }

    public Integer  getSupplierId(){
        return this.supplierId;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setOpinion(String opinion){
        this.opinion = opinion;
    }

    public String getOpinion(){
        return this.opinion;
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

    public void setContractName(String contractName){
        this.contractName = contractName;
    }

    public String getContractName(){
        return this.contractName;
    }

    public void setContractCode(String contractCode){
        this.contractCode = contractCode;
    }

    public String getContractCode(){
        return this.contractCode;
    }

    public void setContractAttachmentUrl(String contractAttachmentUrl){
        this.contractAttachmentUrl = contractAttachmentUrl;
    }

    public String getContractAttachmentUrl(){
        return this.contractAttachmentUrl;
    }

    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }

    public Date getStartTime(){
        return this.startTime;
    }

    public void setEndTiem(Date endTiem){
        this.endTiem = endTiem;
    }

    public Date getEndTiem(){
        return this.endTiem;
    }


}

