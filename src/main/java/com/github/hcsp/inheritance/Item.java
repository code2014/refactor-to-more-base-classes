package com.github.hcsp.inheritance;

public class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
