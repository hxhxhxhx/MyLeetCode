package com.huaxiti.JUC.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
