package com.alcor.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guchun
 * @description 全剧配置
 * @date 2022/6/28 22:12
 */
// 全局配置：@Configuration， 局部配置不加
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
