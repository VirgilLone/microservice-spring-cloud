package com.lw.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 自定义空值ribbon
 * @author: luo.wen
 * @createTime: 2019/5/8
 */
@Configuration //注解不能在@ComponentScan扫的路径下
//@RibbonClient(name = "microservice-provider-user",configuration = TestConfiguration.class)
public class TestConfiguration {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
