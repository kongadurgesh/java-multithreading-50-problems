package entity;

public class MyThread_2 implements Runnable {
    public MyThread_2() {
        Thread.currentThread().setName("Runnable Thread");
    }

    @Override
    public void run() {
        System.out.println("Inside: " + Thread.currentThread().getName());
    }
}
