package com.thread.lock_thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcount {
    private int balance = 1000;

    private Lock lockIs = new ReentrantLock();

    public void withdrawal(int amount){
        System.out.println(Thread.currentThread().getName()+" is attemting to withdraw "+ amount);
        try{
            if(lockIs.tryLock(5000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+" is proceeding to withdrawal");
                        balance-=amount;
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+" completed the transaction.");
                        System.out.println("Remaining balance "+ balance);
                    }
                    catch (Exception e) {}
                    finally {
                        lockIs.unlock();
                    }
                }else{
                    System.out.println("insificient balance.");
                }
            }else {
                System.out.println(Thread.currentThread().getName()+" Could not aquire the lock, try later. ");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
