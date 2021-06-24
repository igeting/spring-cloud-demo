package com.example.consum.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provide")
public interface HelloService {
    @RequestMapping("/hello")
    String Hello();
}
