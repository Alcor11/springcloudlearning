package com.alcor.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guchun
 * @description product controller
 * @date 2022/6/28 21:52
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/{id}")
    public String getProduct(@PathVariable Integer id) {
        System.out.println("获得product" + id);
        return "product" + id + "查询" + port;
    }

}
