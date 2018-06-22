package com.aaxiscommerce.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ProductService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInventoryInfoFallback")
    public String getInventoryInfo(String pId) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://inventory-service/inventoryByProduct?pId={1}", String.class, pId);
        String inventory = responseEntity.getBody();
        log.info("inventory from inventory-service ---" + inventory);
        return inventory;
    }

    @HystrixCommand(fallbackMethod = "getPriceInfoFallback")
    public String getPriceInfo(String pId) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://price-service/priceByProduct?pId={1}", String.class, pId);
        String price = responseEntity.getBody();
        log.info("price from price-service ---" + price);
        return price;
    }

    public String getInventoryInfoFallback(String pId) {
        log.info("inventory from Fallback ---");
        return "-1";
    }

    public String getPriceInfoFallback(String pId) {
        log.info("price from Fallback ---");
        return "-1";
    }
}

