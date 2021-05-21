package com.example.myspringboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: GetController
 * @Description get
 * @Author huangzb
 * @Date 2021/5/21
 * @Time 15:16
 */
// RestController为org.springframework.web的注解

@RestController
@RequestMapping("/get")
public class GetController {

    @RequestMapping("/hello")
    public Object getHello(){
        return "hello";
    }

}
