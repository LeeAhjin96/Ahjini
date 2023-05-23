package ch07;

abstract class Shape {
     double pi = 3.14;

     abstract void draw();

     public double findArea() {
         return 0.0;
     }
}

class Circle extends Shape {
     int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("원을 그리다.");
    }

    public double findArea() {
        return pi * radius * radius;
    }
}

class Starfish extends Shape {
    int radius;

    public Starfish(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("불가사리 그리기");
    }
    public double findArea() {
        return pi * radius * 8;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.draw();
        System.out.printf("원의 넓이는 %.1f\n", c.findArea());

        Starfish s = new Starfish(5);
        s.draw();
        System.out.printf("불가사리의 넓이는 %.1f", s.findArea());

//        Rectangle r = new Rectangle(3, 4);
//        r.draw();
//        System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());
    }
}