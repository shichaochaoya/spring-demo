package com.imooc.ioc.demo1;

public class FoodImpl implements Food {
    private String name;
    private String taste;
    private String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void getFood() {
        System.out.println(name + "属于" + kind + "，口味" + taste);
    }
}
