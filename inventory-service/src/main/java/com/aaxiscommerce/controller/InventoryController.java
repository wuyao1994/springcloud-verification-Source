package com.aaxiscommerce.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@Slf4j
@RestController
public class InventoryController {


    @GetMapping(value = "/inventoryByProduct")
    public String inventoryByProduct(@RequestParam String pId) {
        Integer random = new Random().nextInt(10);
        log.info("inventory for product {} is {}", pId, random);
        return random.toString();
    }
}
