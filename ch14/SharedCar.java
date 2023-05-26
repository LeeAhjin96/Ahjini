package ch14;

import java.util.Random;

public class SharedCar {
    public synchronized void drive(String name, String where) {
        System.out.println(name + "님이 자동차탐");
        Random r = new Random();
        for (int i = 0; i < r.nextInt(3) + 1; i++) {
            System.out.println(name + "님이 자동차 운전함!");
        }
        System.out.println(name + "님이" + where + "에 도착함!");
    }
}
