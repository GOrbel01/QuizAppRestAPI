package com.geo.proto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Encapsulates @Configuration @EnableAutoConfiguration,
//@EnableWebMVC (Not needed) and @ComponentScan annotations
@SpringBootApplication
public class ProtoMain {
    public static void main(String[] args) {
        SpringApplication.run(ProtoMain.class, args);
    }
}
