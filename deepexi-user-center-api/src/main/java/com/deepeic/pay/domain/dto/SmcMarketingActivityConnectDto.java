package com.deepeic.pay.domain.dto;

import com.deepeic.pay.domain.eo.SmcMarketingActivityConnect;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc smc_marketing_activity_connect
 * @author admin
 */
public class SmcMarketingActivityConnectDto implements Serializable {
    private String id;

    private String mtiId;

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

