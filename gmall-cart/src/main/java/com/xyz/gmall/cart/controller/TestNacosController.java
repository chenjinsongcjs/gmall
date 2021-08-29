package com.xyz.gmall.cart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈进松
 * @Date: 2021/08/27/22:25
 * @Description:
 */
@RestController
public class TestNacosController {
    @Value("${person.name}")
    private String name;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}