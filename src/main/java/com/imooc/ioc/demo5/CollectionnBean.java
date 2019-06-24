package com.imooc.ioc.demo5;

import java.util.*;

public class CollectionnBean {
    private String[] arrs;
    private List<String> list;
    private Set<String> strings;
    private Map<String,Integer> map;
    private Properties properties;

    @Override
    public String toString() {
        return "CollectionnBean{" +
                "arrs=" + Arrays.toString(arrs) +
                ", list=" + list +
                ", strings=" + strings +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getStrings() {
        return strings;
    }

    public void setStrings(Set<String> strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
