package com.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wujj on 2017/9/22.
 */
@RestController
public class ComputeController {


    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        List<ServiceInstance> instanceList = client.getInstances("compute-service");
        ServiceInstance instance = instanceList.get(0);
        System.out.println("host" + instance.getHost() + "  service_id " + instance.getServiceId() + " port: " + instance.getPort());
        Integer r = a + b;
        return r;
    }
}
