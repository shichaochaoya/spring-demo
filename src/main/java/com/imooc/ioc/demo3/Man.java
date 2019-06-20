package com.imooc.ioc.demo3;

public class Man {
    public Man() {
        System.out.println("Man被实例化了");
    }
    public void init(){
        System.out.println("Man被初始化了");
    }
    public void destory(){
        System.out.println("Man被销毁了");
    }
}
