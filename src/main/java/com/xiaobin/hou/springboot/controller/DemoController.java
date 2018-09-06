/**
 * @author xiaobin.hou
 * @create 2018-09-06 12:13
 **/
package com.xiaobin.hou.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo(){
        return "hello_spring_boot";
    }

}