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

}
