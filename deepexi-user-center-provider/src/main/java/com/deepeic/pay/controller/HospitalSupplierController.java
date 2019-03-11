package com.deepeic.pay.controller;

import com.deepeic.pay.service.HospitalSupplierService;
import com.deepeic.pay.domain.eo.HospitalSupplier;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/hospitalSuppliers")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class HospitalSupplierController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HospitalSupplierService hospitalSupplierService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam HospitalSupplier eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(hospitalSupplierService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam HospitalSupplier eo) {
        return new Payload(hospitalSupplierService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") Integer  pk) {
        return new Payload(hospitalSupplierService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(HospitalSupplier eo) {
        return new Payload(hospitalSupplierService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") Integer  pk, HospitalSupplier eo) {
        return new Payload(hospitalSupplierService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") Integer  pk) {
        return new Payload(hospitalSupplierService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(Integer [] pks) {
        return new Payload(hospitalSupplierService.delete(pks));
    }
}
