package com.imooc.ioc.demo2;

import org.springframework.beans.factory.BeanFactory;

/**
 *Bean实例化的三种方式：采用无参数的构造方法的方式
 * */

public class Bean1 {
    public Bean1() {
        System.out.println("Bean1被实例化了。。。");
    }
}
