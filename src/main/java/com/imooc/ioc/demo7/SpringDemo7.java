package com.imooc.ioc.demo7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;

public class SpringDemo7 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        bean1.say();
        ((ClassPathXmlApplicationContext) applicationContext).close();

    }

    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean1 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean1 == bean2);

    }
}
