package com.deepeic.pay.domain.dto;

import com.deepeic.pay.domain.eo.HospitalSupplier;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc hospital_supplier
 * @author admin
 */
public class HospitalSupplierDto implements Serializable {
    private Integer  id;

    private String hospital;

    private Integer  supplierId;

    private String status;

    private String opinion;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private Boolean dr;

    private String contractName;

    private String contractCode;

    private String contractAttachmentUrl;

    private Date startTime;

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

