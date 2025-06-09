package com.thread.lock_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static final Lock lockIs = new ReentrantLock();

    public static  void outterMethod(){
        lockIs.lock();
        try {
            System.out.println("out");
            innerMethod();
        }finally {
            lockIs.unlock();
        }
    }

    public static void innerMethod(){
        lockIs.lock();
        try{
            System.out.println("inner");
        }finally {
            lockIs.unlock();
        }
    }

    public static void main(String[] args) {
        outterMethod();
    }
}
