package MultiThreading;

public class MyThread01 extends Thread {

    MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running!");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01("t1");
        MyThread01 t2 = new MyThread01("t2");

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
