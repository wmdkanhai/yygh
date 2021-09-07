package com.wmding.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 明月
 * @version 1.0
 * @date 9/7/21 8:36 PM
 * @description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.wmding")
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}