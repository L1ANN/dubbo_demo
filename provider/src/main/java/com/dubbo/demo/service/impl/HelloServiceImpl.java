package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.HelloService;

import java.util.Date;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 下午2:43 2018/9/23
 * @Modified By:
 */
public class HelloServiceImpl implements HelloService {
    public String hello(String name){
        System.out.println("Hello service is calling:"+new Date());
        String helloMessage = "Hello" + name;
        return helloMessage;
    }
}
