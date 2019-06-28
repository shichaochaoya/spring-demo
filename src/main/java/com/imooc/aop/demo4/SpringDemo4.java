package com.imooc.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springAop2.xml")
public class SpringDemo4 {

    //@Resource(name = "customeDao")
    //环绕增强类型
    @Resource(name = "customerDaoProxy")
    private CustomeDao customeDao;

    @Test
    public void demo1(){
        customeDao.delete();
        customeDao.find();
        customeDao.save();
        customeDao.update();
    }


}
