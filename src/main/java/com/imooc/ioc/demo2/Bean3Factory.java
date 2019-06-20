package com.imooc.ioc.demo2;

/**
 * bean3实力工厂
 * */
public class Bean3Factory {
    public Bean3 creatBean3(){
        System.out.println("Bean3实例工厂执行了");
        return new Bean3();
    }
}
