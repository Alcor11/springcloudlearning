package com.alcor.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guchun
 * @description feign远程调用
 * @date 2022/6/28 21:04
 */
// name is service name , path is requestMapping url
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {

    @RequestMapping("/reduce")
    public String reduce();

}
