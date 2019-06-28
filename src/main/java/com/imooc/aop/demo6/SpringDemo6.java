package com.imooc.aop.demo6;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SpringAop4.xml")
public class SpringDemo6 {
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Resource(name = "customeDao")
    private CustomeDao customeDao;

    @Test
    public void demo1(){
        studentDao.find();
        studentDao.delete();
        studentDao.save();
        studentDao.update();

        customeDao.delete();
        customeDao.find();
        customeDao.save();
        customeDao.update();
    }

}
