package ch12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc25treamDemo {
    public static void main(String[] args) {
        IntStream is1 = IntStream.iterate(1, x -> x + 2);

        IntStream is2 = new Random().ints(0, 10);

        Stream<Double> ds = Stream.generate(Math::random);

        IntStream is3 = IntStream.range(1, 5);
    }
}
