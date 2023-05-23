package ch06;

class Person {
    String name = "사람";
    
    void whoami() {
        System.out.println("나는 사람이다.");
    }
}

class Student extends Person {
    int number = 7;
    void work() {
        System.out.println("나는 공부하.");
    }
}

public class UpCastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s;
        p.whoami();
    }
}