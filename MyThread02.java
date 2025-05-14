public class MyThread02 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CThread t1 = new CThread(counter);
        CThread t2 = new CThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCounter());
    }
}

class Counter {
    int count;

    synchronized void increment() {
        count++;
    }

    int getCounter() {
        return count;
    }
}

class CThread extends Thread {
    Counter counter;

    CThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            counter.increment();
        }
    }
}