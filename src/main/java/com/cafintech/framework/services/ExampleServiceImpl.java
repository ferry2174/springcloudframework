package com.cafintech.framework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Bob on 12/13/16.
 */
@Service
public class ExampleServiceImpl implements ExampleService {
    public String helloWorld(String hello) {
        return hello + " world! !!@#$hehe";
    }
}
