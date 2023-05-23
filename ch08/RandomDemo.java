package ch08;

import java.util.Random;
//랜덤으로 숫자 5개 호출
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.print(r.nextInt(100) + " ");
        }
    }
}
