/**
 * @author xiaobin.hou
 * @create 2018-09-10 10:05
 **/
package com.xiaobin.hou.springboot.beans;

public class Driver {

    private String id;
    private String name;
    private Car car;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}