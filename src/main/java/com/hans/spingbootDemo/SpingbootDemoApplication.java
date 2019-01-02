package com.hans.spingbootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.hans.spingbootDemo.mapper")
//扫描 所有需要的包，包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages = {"com.hans.spingbootDemo", "org.n3r.idworker"})
//开启定时任务
@EnableScheduling
//开启异步任务
@EnableAsync
public class SpingbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootDemoApplication.class, args);
    }

}

