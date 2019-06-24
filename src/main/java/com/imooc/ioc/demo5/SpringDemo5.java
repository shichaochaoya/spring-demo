package com.imooc.ioc.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo5 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CollectionnBean collectionnBean = (CollectionnBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionnBean);
    }
}
