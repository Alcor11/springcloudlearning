package com.alcor.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author guchun
 * @description 自定义随机负载均衡机制
 * @date 2022/6/28 16:23
 */
public class CustomRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {

        ILoadBalancer loadBalancer = this.getLoadBalancer();
        // 获得当前请求的服务实例
        List<Server> reachableServers = loadBalancer.getReachableServers();

        int random = ThreadLocalRandom.current().nextInt(reachableServers.size());

        Server server = reachableServers.get(random);
//        if (server.isAlive()) {
//            return server;
//        }
        return server;
    }
}
