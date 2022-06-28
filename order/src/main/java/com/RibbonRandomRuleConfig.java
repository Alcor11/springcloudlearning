package com;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guchun
 * @description TODO
 * @date 2022/6/28 16:04
 */
@Configuration
public class RibbonRandomRuleConfig {

    // 方法名一定要角iRule
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
