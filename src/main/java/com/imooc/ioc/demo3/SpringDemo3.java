package com.imooc.ioc.demo3;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        man.run();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    /**
     * BeanPostProcessor的作用 为AOP做铺垫，在初始化之前可以执行函数
     * */
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.del();
        userDao.findAll();
        userDao.save();
        userDao.update();
       }



}
