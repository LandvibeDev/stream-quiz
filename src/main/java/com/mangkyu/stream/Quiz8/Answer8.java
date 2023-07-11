package com.mangkyu.stream.Quiz8;

import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Answer8 {

    public List<Integer> quiz1() {
        return Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
            .limit(10)
            .mapToInt(t -> t[0])
            .boxed().collect(Collectors.toList());
    }

    public List<Integer> quiz2() {
        IntSupplier fib = new IntSupplier() {

            private int previous = 0;
            private int current = 1;

            @Override
            public int getAsInt() {
                int nextValue = previous + current;
                previous = current;
                current = nextValue;
                return previous;
            }

        };
        return IntStream.generate(fib)
            .limit(10)
            .boxed().collect(Collectors.toList());
    }

}
