package ch0203;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        System.out.printf("%d * %d은 %d입니다\n", x, y, x * y);
//        String aa = in.nextLine();
//        String bb = in.nextLine();
//        System.out.println("aa"+"bb");

//        int remainder = 25 % 2;
//        System.out.println("25 나누기 2의 나머지는 " + remainder + "님다");


        //대입 연산자 응용
        int value = 1;
        value += 1;
        System.out.println("값 = " + value);
        value -= 1;
        System.out.println("값 = " + value);
        value <<= 3;
        System.out.println("값 = " + value);
        value %= 3;
        System.out.println("값 = " + value);

    }
}
