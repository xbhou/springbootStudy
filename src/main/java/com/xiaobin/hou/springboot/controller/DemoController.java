/**
 * @author xiaobin.hou
 * @create 2018-09-06 12:13
 **/
package com.xiaobin.hou.springboot.controller;

import com.xiaobin.hou.springboot.config.Sam1;
import com.xiaobin.hou.springboot.config.Sam2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Sam1 sam1;

    @Autowired
    private Sam2 sam2;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        return "hello_spring_boot";
    }


    @RequestMapping(value = "/sam",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String getSam(){

        System.out.println(sam1);
        System.out.println(sam2);

        return sam1 + " - " + sam2;
    }

}