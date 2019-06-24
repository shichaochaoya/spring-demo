package com.imooc.ioc.demo4;

public class Product {
    private String namr;
    private String price;
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "namr='" + namr + '\'' +
                ", price='" + price + '\'' +
                ", category=" + category +
                '}';
    }

    public String getNamr() {
        return namr;
    }

    public void setNamr(String namr) {
        this.namr = namr;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
