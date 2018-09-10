package com.xiaobin.hou.springboot.config;

import com.xiaobin.hou.springboot.beans.Car;
import com.xiaobin.hou.springboot.beans.Driver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentConfigurationTest {
    @Autowired
    private Driver driver;
    @Autowired
    private Car car;

    /*
    com.xiaobin.hou.springboot.config.ComponentConfiguration 使用注解@Configration 和@Component区别
        @Configuration  当时Configuration注解时，生成当前对象的子类Class，并对方法拦截，第二次调用car()方法时直接从BeanFactory之中获取对象，所以得到的是同一个对象
        @Component  不会使用CGLIB代理

        源码参见：
            ConfigurationClassPostProcessor.enhanceConfigurationClasses

            //是否为精简配置类
            public static boolean isLiteConfigurationCandidate(AnnotationMetadata metadata)

            //是否为完整配置类
            public static boolean isFullConfigurationCandidate(AnnotationMetadata metadata)

            //是否为配置类
            public static boolean isConfigurationCandidate(AnnotationMetadata metadata)
     */
    @Test
    public void contextLoad(){

        Car driverCar = driver.getCar();

        boolean isSame = driverCar == car;

        System.out.println("driverCar is same to car : " + isSame);

    }

}