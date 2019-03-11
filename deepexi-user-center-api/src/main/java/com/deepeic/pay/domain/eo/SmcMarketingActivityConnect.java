package com.deepeic.pay.domain.eo;


import com.deepexi.util.mapper.SuperEntity;

import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc smc_marketing_activity_connect
 * @author admin
 */
//@ApiModel(description = "smc_marketing_activity_connect")
public class SmcMarketingActivityConnect implements Serializable{

    //@ApiModelProperty(value = "主键ID")
    private String id;

    //@ApiModelProperty(value = "所属促销工具信息ID")
    private String mtiId;

    //@ApiModelProperty(value = "所属促销活动信息ID")
    private String maiId;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setMtiId(String mtiId){
        this.mtiId = mtiId;
    }

    public String getMtiId(){
        return this.mtiId;
    }

    public void setMaiId(String maiId){
        this.maiId = maiId;
    }

    public String getMaiId(){
        return this.maiId;
    }


}

