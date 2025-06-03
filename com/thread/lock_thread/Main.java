package com.thread.lock_thread;

public class Main {
    public static void main(String[] args){
        BankAcount bankAcount = new BankAcount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
            bankAcount.withdrawal(400);
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
