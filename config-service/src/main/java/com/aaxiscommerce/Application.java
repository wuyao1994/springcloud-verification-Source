package com.aaxiscommerce;

import com.aaxiscommerce.cloud.annotation.server.ACCPConfigServer;
import org.springframework.boot.SpringApplication;

@ACCPConfigServer
public class Application {

    public static void main(String[] args) {
        System.setProperty("jsse.enableSNIExtension", "false");
        SpringApplication.run(Application.class, args);
    }
}
