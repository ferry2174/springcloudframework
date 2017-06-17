package com.cafintech.framework.controllers;

import com.cafintech.framework.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by Bob on 12/13/16.
 */
@RestController
public class Example {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/{param}")
    String home(@PathParam("param") String hello) {
        return exampleService.helloWorld(hello);
    }

}
