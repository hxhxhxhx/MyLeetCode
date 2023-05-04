package com.huaxiti.JUC.Thread.concurrent;

import java.util.concurrent.Callable;

public class fun3 implements Callable<String> {
    private String value;

    public fun3(String value) {
        this.value = value;
    }

    public fun3() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String call() throws Exception {
        return value;
    }
}
