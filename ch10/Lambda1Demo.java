package ch10;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1Demo {
    public static void main(String[] args) {
        String[] strings = {"로마법따라요", "시간금인디", "펜>칼"};
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
