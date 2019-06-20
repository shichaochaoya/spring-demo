package com.imooc.ioc.demo2;

public class Bean2Factory {
    public static Bean2 creatBean2(){
        System.out.println("Bean2被创建成功");
        return new Bean2();
    }
}
