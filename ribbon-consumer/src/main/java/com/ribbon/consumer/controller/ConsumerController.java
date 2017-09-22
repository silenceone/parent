package com.ribbon.consumer.controller;

import com.ribbon.consumer.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujj on 2017/9/22.
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;

    @GetMapping(value = "/add")
    public String add() {
        return computeService.addService();
    }
}
