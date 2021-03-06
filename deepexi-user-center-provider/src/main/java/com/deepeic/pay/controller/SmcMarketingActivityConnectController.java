package com.deepeic.pay.controller;

import com.deepeic.pay.service.SmcMarketingActivityConnectService;
import com.deepeic.pay.domain.eo.SmcMarketingActivityConnect;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/smcMarketingActivityConnects")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class SmcMarketingActivityConnectController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SmcMarketingActivityConnectService smcMarketingActivityConnectService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam SmcMarketingActivityConnect eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(smcMarketingActivityConnectService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam SmcMarketingActivityConnect eo) {
        return new Payload(smcMarketingActivityConnectService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(smcMarketingActivityConnectService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(SmcMarketingActivityConnect eo) {
        return new Payload(smcMarketingActivityConnectService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, SmcMarketingActivityConnect eo) {
        return new Payload(smcMarketingActivityConnectService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(smcMarketingActivityConnectService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(smcMarketingActivityConnectService.delete(pks));
    }
}
