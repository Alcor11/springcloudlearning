package com.alcor.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guchun
 * @description TODO
 * @date 2022/6/28 22:13
 */
@FeignClient(name = "product-service", path = "/product")
public interface ProductFeignService {

    @RequestMapping("/{id}")
    String getProduct(@PathVariable(value = "id") Integer id);

}
