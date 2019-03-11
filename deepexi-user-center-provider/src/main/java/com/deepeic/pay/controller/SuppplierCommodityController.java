package com.deepeic.pay.controller;

import com.deepeic.pay.service.SuppplierCommodityService;
import com.deepeic.pay.domain.eo.SuppplierCommodity;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/suppplierCommoditys")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class SuppplierCommodityController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SuppplierCommodityService suppplierCommodityService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam SuppplierCommodity eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(suppplierCommodityService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam SuppplierCommodity eo) {
        return new Payload(suppplierCommodityService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(suppplierCommodityService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(SuppplierCommodity eo) {
        return new Payload(suppplierCommodityService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, SuppplierCommodity eo) {
        return new Payload(suppplierCommodityService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(suppplierCommodityService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(suppplierCommodityService.delete(pks));
    }
}
