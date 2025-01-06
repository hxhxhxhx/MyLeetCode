package com.huaxiti;

public class CountNum {
    private String name;
    private int num = 0;

    public int getNum() {
        return num;
    }

    public CountNum setNum(int num) {
        this.num = num;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountNum setName(String name) {
        this.name = name;
        return this;
    }

//    @Override
//    public String toString() {
//        return "CountNum{" +
//                "name='" + name + '\'' +
//                ", num=" + num +
//                '}';
//    }
}
