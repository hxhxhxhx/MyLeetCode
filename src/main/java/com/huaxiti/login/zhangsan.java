package com.huaxiti.login;

public class zhangsan extends Student{

    private String hoby;

    public zhangsan(String name) {
        super(name);
    }

    public String getHoby(){
        return hoby + getName();
    }

    @Override
    public String getName(){
        return this.name;
    }



    public zhangsan() {

    }
}
