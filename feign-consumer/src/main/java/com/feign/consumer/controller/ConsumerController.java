package com.feign.consumer.controller;

import com.feign.consumer.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujj on 2017/9/22.
 */
@RestController
public class ConsumerController {
    @Autowired
   private ComputeClient computeClient;

    @GetMapping(value = "/add")
    public Integer add() {
        return computeClient.add(10, 20);
    }

    ;
}
