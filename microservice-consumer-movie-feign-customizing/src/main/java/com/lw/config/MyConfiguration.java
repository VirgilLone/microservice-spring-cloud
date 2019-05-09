package com.lw.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 自定义的feign的配置
 * @author: luo.wen
 * @createTime: 2019/5/9
 */
@Configuration
public class MyConfiguration {

    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

}
