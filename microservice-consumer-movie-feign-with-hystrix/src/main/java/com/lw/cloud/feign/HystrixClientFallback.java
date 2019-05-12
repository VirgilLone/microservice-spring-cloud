package com.lw.cloud.feign;

import com.lw.cloud.entity.User;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: luo.wen
 * @createTime: 2019/5/12
 */
@Component
public class HystrixClientFallback implements UserFeignClient{
    @Override
    public User findByIddd(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
