package com.xyz.gmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈进松
 * @Date: 2021/08/27/0:41
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class MemberMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberMainApplication.class,args);
    }
}