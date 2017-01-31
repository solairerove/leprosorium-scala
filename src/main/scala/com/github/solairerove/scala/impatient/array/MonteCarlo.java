package com.github.solairerove.scala.impatient.array;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.lang.Math.hypot;
import static java.lang.Math.random;
import static java.lang.System.out;

public interface MonteCarlo {

    static void main(String... args) {
        IntStream.of(
                10000,
                100000,
                1000000,
                10000000,
                100000000
        )
                .mapToDouble(MonteCarlo::pi)
                .forEach(out::println)
        ;
    }

    static double range() {
        return (random() * 2) - 1;
    }

    static double pi(int numThrows) {
        long inCircle = DoubleStream.generate(
                () -> hypot(range(), range())
        )
                .limit(numThrows)
                .unordered()
                .parallel()
                .filter(d -> d < 1)
                .count()
                ;

        return (4.0 * inCircle) / numThrows;
    }
}
