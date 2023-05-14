package com.ch10.thread;

public class T01_Demo {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getThreadGroup());
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
