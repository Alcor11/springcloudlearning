package com.alcor.order;

import com.alcor.order.feign.ProductFeignService;
import com.alcor.order.feign.StockFeignService;
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

    @Autowired
    StockFeignService stockFeignService;

    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("success");
//        String forObject = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        String reduce = stockFeignService.reduce();
        String product = productFeignService.getProduct(1);
        return "hello" + reduce + "product" + product;
    }
}
