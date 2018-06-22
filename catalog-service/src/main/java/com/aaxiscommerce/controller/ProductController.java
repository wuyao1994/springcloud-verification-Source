package com.aaxiscommerce.controller;

import com.aaxiscommerce.cloud.annotation.web.ACCPGetMapping;
import com.aaxiscommerce.domain.Product;
import com.aaxiscommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @ACCPGetMapping(value = "/product")
    public Product productData(@RequestParam String pId) {
        String priceInfo = productService.getPriceInfo(pId);
        String inventoryInfo = productService.getInventoryInfo(pId);
        Product product = new Product(pId, priceInfo, inventoryInfo);
        return product;
    }
}
