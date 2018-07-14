package com.abin.lee.nearby.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/nearby")
@Slf4j
public class NearbyController {

    @Autowired
    private Environment env;



    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public String add(Integer param1) {
        String localParam = env.getProperty("local.param");
        log.info("localParam= " + localParam);
        return localParam;
    }


}
