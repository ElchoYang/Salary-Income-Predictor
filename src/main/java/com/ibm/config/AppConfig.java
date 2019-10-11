package com.ibm.config;

import com.ibm.entity.PredictionSalary;
import com.ibm.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/********************
 * Spring 注解配置类
 */
@Configuration
@ComponentScan("com.ibm.service.impl")
public class AppConfig {

    @Bean
    public User initUser() {
        System.out.println("============initUser User ==========");
        return new User();
    }

    @Bean
    public List<PredictionSalary> initPredictionList() {
        System.out.println("============initUser User ==========");
        return new ArrayList<>();
    }

}
