package com.alcor.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guchun
 * @description TODO
 * @date 2022/6/24 15:03
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("success");
        String forObject = restTemplate.getForObject("http://localhost:8011/stock/reduce", String.class);

        return "hello" + forObject;
    }
}
