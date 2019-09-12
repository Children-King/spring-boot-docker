package com.childrenking.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: rhyme
 * @date: 2019-09-12 13:11
 * @topic: "主题"
 * @description: "描述"
 */
@RestController
public class HelloDockerController {
    @GetMapping
    public Map<String, Object> helloDocker() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Hello, dokcer1");
        return map;
    }

}
