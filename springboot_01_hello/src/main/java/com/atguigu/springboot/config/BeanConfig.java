package com.atguigu.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.springboot.bean.Car;
import com.atguigu.springboot.bean.Pet;
import com.atguigu.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class BeanConfig {

    @Bean("user01")
    public User user01(){
        User user = new User("zhangsan", "22");
        user.setPet(pet1());
        return user;
    }

    @Bean("pet1")
    public Pet pet1(){
        return new Pet("jack");
    }

}
