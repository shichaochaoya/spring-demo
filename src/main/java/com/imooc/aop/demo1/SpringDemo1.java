package com.imooc.aop.demo1;

import com.imooc.ioc.demo4.User;
import org.junit.Test;

public class SpringDemo1 {

    @Test
    public void demo1(){
        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao) new MyjdkProxy(userDao).createProxy();
       proxy.delete();
       proxy.find();
       proxy.save();
       proxy.update();
    }
}
