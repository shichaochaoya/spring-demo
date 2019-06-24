package com.imooc.ioc.demo3;

public class UserImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("查询");
    }

    @Override
    public void save() {
        System.out.println("保存");

    }

    @Override
    public void del() {
        System.out.println("删除");

    }

    @Override
    public void update() {
        System.out.println("修改");

    }
}
