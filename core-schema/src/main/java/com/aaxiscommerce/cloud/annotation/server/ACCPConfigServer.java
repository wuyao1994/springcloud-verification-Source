package com.aaxiscommerce.cloud.annotation.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.lang.annotation.*;

/**
 * Created by terrence on 2018/06/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public @interface ACCPConfigServer {
}
