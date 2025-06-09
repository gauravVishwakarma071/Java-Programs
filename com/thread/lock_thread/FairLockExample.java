package com.thread.lock_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock fariLock = new ReentrantLock(true);

    public void accessResoure(){
        fariLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired the lock.");
            Thread.sleep(3000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Released the lock");
            fariLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResoure();
            }
        };

        Thread t1 = new Thread(task,"T1");
        Thread t2 = new Thread(task,"T2");
        Thread t3 = new Thread(task,"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
