package com.aaxiscommerce.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
@Slf4j
@RestController
public class PriceController {

    @GetMapping(value = "/priceByProduct")
    public String priceByProduct(@RequestParam String pId) {
        Integer random = new Random().nextInt(100);
        log.info("price for product {} is {}", pId, random);
        return random.toString();
    }
}
