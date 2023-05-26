package ch14;


class JoinThread extends Thread {
    int total;

    public void run() {
        for (int i = 0; i < 100; i++) {
            total += i;
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        JoinThread t = new JoinThread();
        t.start();

        try {
            t.join();
            System.out.println("스레드 t가 끝날 때까지 대기 ㅋ");
        } catch (InterruptedException e) {
        }

        System.out.println("총합 : " + t.total);
    }
}
