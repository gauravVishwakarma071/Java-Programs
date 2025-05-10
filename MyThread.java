class MyFThread extends Thread {
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

    @Override
    public void run() {
        System.out.println("I am implemented Runnable");
    }

}

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        MyFThread f1 = new MyFThread();
        System.out.println(Thread.currentThread().getState());
        f1.start();
        System.out.println(f1.getName());

        MySThread s1 = new MySThread();
        Thread t1 = new Thread(s1);
        t1.start();
        t1.join();
    }
}
