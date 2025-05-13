package utility;

import entity.MyThread;
import entity.MyThread_2;

public class Tester {

    public static void testProblem1() {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    public static void testProblem2() {
        Thread myThread_2 = new Thread(new MyThread_2());
        myThread_2.start();
    }

    public static void testProblem3() {
        Thread_1 thread_1 = new Thread_1();
        Thread_2 thread_2 = new Thread_2();
        thread_1.start();
        thread_2.start();
    }
}

class Thread_2 extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

class Thread_1 extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
}
