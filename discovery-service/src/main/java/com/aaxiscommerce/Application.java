package com.aaxiscommerce;

import com.aaxiscommerce.cloud.annotation.server.ACCPDiscoveryServer;
import org.springframework.boot.SpringApplication;

@ACCPDiscoveryServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
