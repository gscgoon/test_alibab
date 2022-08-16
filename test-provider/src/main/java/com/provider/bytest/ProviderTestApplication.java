package com.provider.bytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTestApplication.class,args);
    }

    @RestController
    class EchoController {
        @RequestMapping(value = "/echo", method = RequestMethod.GET)
        public String echo() {
            return "Hello Nacos Discovery ";
        }
    }
}