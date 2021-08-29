package com.xyz.gmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈进松
 * @Date: 2021/08/27/0:46
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class WareMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareMainApplication.class,args);
    }
}