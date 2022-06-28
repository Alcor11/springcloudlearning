package com.alcor;

import com.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guchun
 * @description TODO
 * @date 2022/6/24 15:08
 */
@SpringBootApplication
@EnableFeignClients
//@RibbonClients(value = {
//        @RibbonClient(name="stock-service", configuration = RibbonRandomRuleConfig.class)
//})
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
