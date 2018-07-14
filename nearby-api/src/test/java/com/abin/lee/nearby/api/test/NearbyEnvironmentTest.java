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
public class NearbyEnvironmentTest {
    private static final String httpUrl = "http://localhost:9333/cloud-client/ribbon-client/add?param1=13&param2=33&token=zz";
    private static final String httpCreateUrl = "http://localhost:9000/nearby/add";
//    private static final String httpCreateUrl = "http://localhost:9333/nearby/add";

    public static void main(String[] args) throws IOException {




    }

    @Test
    public void testCloudZuulClient1() throws IOException {
        String result = OkHttpClientUtil.httpPost(httpUrl, null);
        System.out.println("result="+result);
    }

    @Test
    public void testCloudZuulClient2() throws IOException {
        String result = OkHttpClientUtil.httpGet(httpUrl);
        System.out.println("result="+result);
    }

    @Test
    public void testNearbyEnvironment() throws IOException {
        Map<String, String> params = Maps.newHashMap();
        params.put("param1", "123");

        String result = OkHttpClientUtil.httpPost(httpCreateUrl, params);
        System.out.println("result="+result);
    }



}
