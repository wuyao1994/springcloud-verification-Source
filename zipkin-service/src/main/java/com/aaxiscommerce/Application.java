package com.aaxiscommerce;


import com.aaxiscommerce.cloud.annotation.client.ACCPApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import zipkin.server.EnableZipkinServer;

@ACCPApplication
@EnableZipkinServer
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
