package ch14;


class CarThread extends Thread{
    private String who;
    private SharedCar car;
    private String where;

    public CarThread(String who, SharedCar car, String where) {
        this.who = who;
        this.car = car;
        this.where = where;
    }

    public void run() {
        car.drive(who, where);
    }
}
public class SynchroDemo {
    public static void main(String[] args) {
        SharedCar car = new SharedCar();
        new CarThread("아진", car, "서울").start();
        new CarThread("진아", car, "부산").start();
        new CarThread("하진", car, "전주").start();
    }
}
