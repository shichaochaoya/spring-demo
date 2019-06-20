package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo1 {

    /**
     * 传统方式
     */
    @Test
    public void demo1() {
        UserService userService = new UserServiceImpl();
        //设置属性：需要new一个实现类
        //UserServiceImpl userService1 = new UserServiceImpl();
        //userService1.setName("wang");
        userService.sayHello();
    }


    /**
     * spring方式
     */
    @Test
    public void demo2() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    /**
     * spring练习
     * */
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food");
        food.getFood();

    }

    @Test
    /**
     * 读取磁盘系统中的配置文件
     * 使用新版本工厂类
     * */
    public void demo3(){
        //创建Spring的工厂类
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    @Test
    /**
     * 传统模式工厂类：BeanFactory
     * */
    public void demo4(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();

    }
    @Test
    /**
     * 传统模式工厂类：BeanFactory
     * */
    public void demo5(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("D:\\applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();

    }
}
