package ch14;


class WorkerThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class Thread4Demo {
    public static void main(String[] args) {
        Thread t = new WorkerThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.print("안녕 ㅋㅋ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
