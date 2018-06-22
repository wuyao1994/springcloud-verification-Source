package com.aaxiscommerce.cloud.annotation.client;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

/**
 * Created by terrence on 2018/06/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringCloudApplication
@EnableFeignClients
public @interface ACCPApplication {
}
