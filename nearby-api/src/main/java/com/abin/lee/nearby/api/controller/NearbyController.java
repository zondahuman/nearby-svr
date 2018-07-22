package com.abin.lee.nearby.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public String add(Integer param) {
        String localParam = env.getProperty("local.param");
        log.info("---------param= " + param + "  , localParam= " + localParam);
        return localParam;
    }


    @RequestMapping(value = "/create", method = {RequestMethod.GET, RequestMethod.POST})
    public String create(Integer param) {
        List<String> caches = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j <100 ; j++) {
                buffer.append("leeooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"+j);
            }

            caches.add(buffer.toString() + i);
//            caches.add(new byte[1024 * 1024 * 3]);
        }
        return "SUCCESS";
    }


}
