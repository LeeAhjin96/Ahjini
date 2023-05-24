package ch09;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        // TODO: 2023-05-24 this


        // TODO: 2023-05-24 that


        // TODO: 2023-05-24 what
        Scanner in = new Scanner(System.in);

        // TODO: 2023-05-24 gggg
        try {
            square(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("정수가 아님다");
        }
    }
    private static void square(String s) throws NumberFormatException {
        int n = Integer.parseInt(s);
        System.out.println(n * n);
    }
}
