package com.aaxiscommerce.controller;

import com.aaxiscommerce.service.DemoUserFeignService;
import com.aaxiscommerce.service.DemoUserRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by terrence on 2018/06/12.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoUserFeignService demoFeignService;

    @Autowired
    private DemoUserRibbonService demoUserRibbonService;
    @Value("${testValue}")
    private String testValue;

    @RequestMapping("/testValue")
    public String testValue() {
        return this.testValue;
    }
    @GetMapping(path = "/feign/{id}")
    public String getOrderByFeign(@PathVariable String id) {
        return demoFeignService.getOrder(id);
    }



    @GetMapping(path = "/ribbon/{id}")
    public String getOrderByRibbon(@PathVariable String id) {
        return demoUserRibbonService.getOrder(id);
    }

}