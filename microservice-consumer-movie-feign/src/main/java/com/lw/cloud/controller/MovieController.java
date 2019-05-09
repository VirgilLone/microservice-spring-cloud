package com.lw.cloud.controller;

import com.lw.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by WYluo on 2018/4/7.
 */
@RestController
public class MovieController {


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return null;
    }

}
