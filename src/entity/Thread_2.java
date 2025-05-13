package entity;

public class Thread_2 extends Thread {
    public void run() {
        for (int i = 6; i < 11; i++) {
            System.out.println(i);
        }
    }
}
