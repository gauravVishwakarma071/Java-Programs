class MyFThread extends Thread {

    MyFThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("I am extented Thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class MySThread implements Runnable {
    MySThread(String name) {
        super();

    }

    @Override
    public void run() {
        System.out.println("I am implemented Runnable");
    }

}

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        MyFThread f1 = new MyFThread("First");
        System.out.println(Thread.currentThread().getName());
        f1.start();
        System.out.println(f1.getName());

        MySThread s1 = new MySThread("Second");
        Thread t1 = new Thread(s1);
        t1.start();
        t1.join();
    }
}
