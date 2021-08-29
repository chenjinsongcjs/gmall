package com.xyz.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈进松
 * @Date: 2021/08/28/22:47
 * @Description: 网关跨域配置
 */
@Configuration
public class CORSConfig {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedHeader("*"); //允许任何请求头
        corsConfiguration.addAllowedMethod("*"); //允许所有方法
        corsConfiguration.addAllowedOrigin("*"); //允许所有域名
        corsConfiguration.setAllowCredentials(true); //允许Cookie  跨域
        source.registerCorsConfiguration("/**",corsConfiguration); //针对所有请求
        return new CorsWebFilter(source);
    }
}