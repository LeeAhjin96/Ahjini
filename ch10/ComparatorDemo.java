package ch10;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String[] strings = {"로마에 가면 로마법을 따라.",
                "시간은금이다ㅏㅏㅏㅏㅏㅏ아아아아", "펜은 칼보다 강함"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });

        for (String s : strings)
            System.out.println(s);
    }
}
