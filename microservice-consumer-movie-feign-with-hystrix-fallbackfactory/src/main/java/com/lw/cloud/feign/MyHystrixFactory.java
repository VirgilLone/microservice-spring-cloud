package com.lw.cloud.feign;

import com.lw.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @description:使用fallbackfactory返回
 * @author: luo.wen
 * @createTime: 2019/5/12
 */
@Component
public class MyHystrixFactory implements FallbackFactory<UserFeignClient> {
    Logger LOGGER = LoggerFactory.getLogger(MyHystrixFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        LOGGER.info("fallback; reason was: {}", throwable.getMessage());
        return new UserFeignClientWithFactory() {
            @Override
            public User findByIddd(Long id) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
