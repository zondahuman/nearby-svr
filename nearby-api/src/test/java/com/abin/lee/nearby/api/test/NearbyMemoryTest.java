package com.abin.lee.nearby.api.test;

import com.abin.lee.nearby.common.OkHttpClientUtil;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * Created by abin on 2018/7/12.
 *  http://localhost:9477/cloud-client/ribbon-client/add?param1=13&param2=33&token=zz
 */
public class NearbyMemoryTest {
    private static final String httpUrl = "http://localhost:9333/cloud-client/ribbon-client/add?param1=13&param2=33&token=zz";
//    private static final String httpCreateUrl = "http://localhost:8333/nearby/create";
//    private static final String httpCreateUrl = "http://localhost:8444/nearby/create";
//    private static final String httpCreateUrl = "http://localhost:9000/nearby/add";
    private static final String httpAdd = "http://localhost:8333/nearby/add";
    private static final String httpAdd1 = "http://localhost:8333/nearby/add1";



    @Test
    public void testNearbyMemory() throws IOException {
        Map<String, String> params = Maps.newHashMap();
        params.put("param", "123");

        String result = OkHttpClientUtil.httpPost(httpAdd, params);
        System.out.println("result="+result);
    }

    @Test
    public void testNearbyMemory1() throws IOException {
        Map<String, String> params = Maps.newHashMap();
        params.put("param", "456");

        String result = OkHttpClientUtil.httpPost(httpAdd1, params);
        System.out.println("result="+result);
    }




}
