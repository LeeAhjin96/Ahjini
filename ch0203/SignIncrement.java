package ch0203;

public class SignIncrement {
    public static void main(String[] args) {
//        int plusOne = 1;
//        int minusOne = -plusOne;
//        System.out.println("plusOne은" + plusOne + "임");
//        System.out.println("minusOne은" + minusOne + "임");
//
//        int x = 1, y = 1;
//        System.out.println("x=" + x + ", ++x=" + ++x);
//        System.out.println("y=" + y + ", y++=" + y++);
//        System.out.println("x=" + x + ", y=" + y);

        //삼항 연산 예제
        int x = 1;
        int y;
        y = (x == 1) ? 10 : 20;
        System.out.println(y);
        y = (x > 1) ? x++ : x + 20;
        System.out.println(x);
        System.out.println(y);

        System.out.println(5 > 3 ? "true" : "false");

    }
}
