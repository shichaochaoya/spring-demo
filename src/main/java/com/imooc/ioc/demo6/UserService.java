package com.imooc.ioc.demo6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Spring的Bean管理注解方式：
 */
@Service("userService")
public class UserService {

    //按类注入 == @Resource
    /*@Autowired
    @Qualifier("userDao")*/
    @Resource(name = "userDao")
    UserDao userDao;

    /*按名称注入*/
    @Value("米饭")
    private String something;

    public String sayHello(String name) {
        return "Hello  " + name;
    }

    public void eat() {
        System.out.println("eat :" + something);
    }

    public void save() {
        System.out.println("Service保存yonghu");
        userDao.save();
    }
}
