package thread;

// extends Thread, implements Runnable
// 두 가지 방법으로 스레드 생성

// class MyTread extends Thread {
class MyTread implements Runnable {
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");

            try {
                // sleep(100);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("start");

        // 1. extends Thread
        // MyTread th1 = new MyTread();
        // MyTread th2 = new MyTread();
        // th1.start();
        // th2.start();

        // 2. implements Runnable
        // MyTread run1 = new MyTread();
        // Thread th1 = new Thread(run1);
        // th1.start();

        // MyTread run2 = new MyTread();
        // Thread th2 = new Thread(run2);
        // th2.start();

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("end");
    }
}
