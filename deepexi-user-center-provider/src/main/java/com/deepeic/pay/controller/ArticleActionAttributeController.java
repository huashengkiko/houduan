package com.deepeic.pay.controller;

import com.deepeic.pay.service.ArticleActionAttributeService;
import com.deepeic.pay.domain.eo.ArticleActionAttribute;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/articleActionAttributes")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ArticleActionAttributeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ArticleActionAttributeService articleActionAttributeService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam ArticleActionAttribute eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(articleActionAttributeService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam ArticleActionAttribute eo) {
        return new Payload(articleActionAttributeService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(articleActionAttributeService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(ArticleActionAttribute eo) {
        return new Payload(articleActionAttributeService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, ArticleActionAttribute eo) {
        return new Payload(articleActionAttributeService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(articleActionAttributeService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(articleActionAttributeService.delete(pks));
    }
}
