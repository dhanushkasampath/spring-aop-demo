package com.learn.spring_aop_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.learn.spring_aop_demo")
@EnableAspectJAutoProxy
public class BeanConfig {
}
