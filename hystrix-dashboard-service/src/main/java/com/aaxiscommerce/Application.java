package com.aaxiscommerce;

import com.aaxiscommerce.cloud.annotation.client.ACCPApplication;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;


@EnableHystrixDashboard
@ACCPApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}