package ch12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array25treamDemo {
    public static void main(String[] args) {
        int[] ia = {2, 3, 5, 7, 11, 13};
        IntStream is = Arrays.stream(ia);

        String[] strings
                = {"The", "pne", "is", "mighter", "than", "the", "sword"};
        Stream<String> ss = Stream.of(strings);

        double[] da = {1.2, 3.14, 5.8, 0.2};
        DoubleStream ds = DoubleStream.of(da);
    }
}
