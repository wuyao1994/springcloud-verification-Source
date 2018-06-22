package com.aaxiscommerce;

import com.aaxiscommerce.cloud.annotation.client.ACCPApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@ACCPApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
