package com.ch10.thread;

/**
 * 通过继承实现线程类
 * 重写run方法
 */
public class T02_threadDemo extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }


    public static void main(String[] args) {
        T02_threadDemo threadDemo = new T02_threadDemo();
        threadDemo.start();
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
