package com.lw.cloud.feign;

import com.lw.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",/*fallback = HystrixClientFallback.class ,*/fallbackFactory = MyHystrixFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findByIddd(@PathVariable("id") Long id); // *feign在调用的时候两个坑：GetMapping组合注解不支持；@PathVariable要设置value


}
