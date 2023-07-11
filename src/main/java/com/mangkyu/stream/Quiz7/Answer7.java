package com.mangkyu.stream.Quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Answer7 {
	public int[] quiz1() {
		return IntStream.rangeClosed(1, 100).boxed()
			.flatMap(a -> IntStream.rangeClosed(a, 100)
				.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).boxed()
				.map(b -> new int[] {a, b, (int)Math.sqrt(a * a + b * b)}))
			.findFirst().orElse(null);
	}

	public int[] quiz1Another() {
		return IntStream.rangeClosed(1, 100).boxed()
			.flatMap(a -> IntStream.rangeClosed(a, 100)
				.mapToObj(b -> new double[] {a, b, Math.sqrt(a * a + b * b)})
				.filter(t -> t[2] % 1 == 0))
			.map(array -> Arrays.stream(array).mapToInt(a -> (int)a).toArray())
			.findFirst().orElse(null);
	}

}
