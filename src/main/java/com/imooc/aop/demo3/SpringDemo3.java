package com.imooc.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springAop.xml")
public class SpringDemo3 {

    /**
     * 注入增强对象
     */
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1() {
        studentDao.find();
        studentDao.delete();
        studentDao.save();
        studentDao.update();
    }
}
