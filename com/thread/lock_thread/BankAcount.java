package com.thread.lock_thread;

public class BankAcount {
    private int balance = 1000;

    public synchronized void withdrawal(int amount){
        System.out.println(Thread.currentThread().getName()+" is attemting to withdraw "+ amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" proceding to withdrawal");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
            balance-=amount;
            System.out.println("Current balance "+balance);
        }
        else {
            System.out.println(Thread.currentThread().getName()+" attemting to withdraw but Insufficient balance");
        }
    }
}
