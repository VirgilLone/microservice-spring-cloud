package com.lw.cloud.controller;

import com.lw.cloud.UserFeignClient;
import com.lw.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by WYluo on 2018/4/7.
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping( "/movie/{id}")
    public User findByIdd(@PathVariable Long id){
        return userFeignClient.findByIdd(id);
    }

}
