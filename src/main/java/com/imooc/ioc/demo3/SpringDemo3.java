package com.imooc.ioc.demo3;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.dc.pr.PRError;

import java.applet.Applet;
import java.lang.ref.PhantomReference;

/**
 * bean的作用范围测试
 * */

public class SpringDemo3 {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");

        System.out.println(person1);
        System.out.println(person2);
    }
    /**
     *bean生命周期
     */
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man) applicationContext.getBean("man");
        System.out.println(man);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
