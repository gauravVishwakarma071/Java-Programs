package com.volatile_vs_atomic;

public class VolatileExample {
    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTure();
        });

        Thread readerThread = new Thread(sharedObj::printIfflagTure);


        writerThread.start();
        readerThread.start();
    }
}
