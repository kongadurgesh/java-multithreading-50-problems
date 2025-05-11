package entity;

public class MyThread extends Thread {

    public MyThread() {
        this.setName("My Thread");
    }

    public void run() {
        System.out.println("Inside: " + Thread.currentThread().getName());
    }
}
