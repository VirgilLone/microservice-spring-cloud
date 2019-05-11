package com.lw.cloud.feign;

import com.lw.config.MyConfiguration;
import com.lw.cloud.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user" , configuration = MyConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /simple/{id}")
    User findByIddd(@Param("id") Long id);



}
