package com.imooc.aop.demo4;

public class CustomeDao {
    public void find() {
        System.out.println("查询客户。。。");
    }

    public void save() {
        System.out.println("保存客户。。。");
    }

    public void delete() {
        System.out.println("删除客户。。。");
    }

    public void update() {
        System.out.println("更新客户。。。");
    }
}
