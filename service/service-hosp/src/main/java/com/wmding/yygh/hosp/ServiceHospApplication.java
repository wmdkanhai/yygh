package com.wmding.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 明月
 * @version 1.0
 * @date 9/4/21 6:55 PM
 * @description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.wmding")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
