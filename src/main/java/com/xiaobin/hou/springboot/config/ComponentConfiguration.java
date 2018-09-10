/**
 * @author xiaobin.hou
 * @create 2018-09-10 10:07
 **/
package com.xiaobin.hou.springboot.config;

import com.xiaobin.hou.springboot.beans.Car;
import com.xiaobin.hou.springboot.beans.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class ComponentConfiguration {

    @Bean
    public Car car(){
        Car car = new Car();
        car.setId("0001");
        car.setName("FaLaLi");
        return car;
    }

    @Bean
    public Driver driver(){
        Driver driver = new Driver();
        driver.setId("driver1");
        driver.setName("冲刺王");
        driver.setCar(car());
        return driver;
    }



}