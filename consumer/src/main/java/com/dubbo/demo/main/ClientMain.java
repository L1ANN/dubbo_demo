package com.dubbo.demo.main;

import com.dubbo.demo.service.HelloService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 下午3:07 2018/9/23
 * @Modified By:
 */
public class ClientMain {

    private static Logger LOGGER = LogManager.getLogger(ClientMain.class);
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        HelloService greetingService = (HelloService) context.getBean("helloService");
        String greetMessage = greetingService.hello("L1ANN");
        System.out.println("Consumer ==> " + greetMessage);
        context.destroy();
    }
}
