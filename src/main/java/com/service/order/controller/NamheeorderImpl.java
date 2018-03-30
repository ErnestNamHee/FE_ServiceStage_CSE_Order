package com.service.order.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-30T10:38:51.966Z")

@RestSchema(schemaId = "namheeorder")
@RequestMapping(path = "/huaweiair/v1", produces = MediaType.APPLICATION_JSON)
public class NamheeorderImpl {

    @Autowired
    private NamheeorderDelegate userNamheeorderDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userNamheeorderDelegate.helloworld(name);
    }

}
