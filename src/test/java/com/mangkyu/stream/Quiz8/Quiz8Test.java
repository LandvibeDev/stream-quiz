package com.mangkyu.stream.Quiz8;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Quiz8Test {

	private final Answer8 answer = new Answer8();
	private final Quiz8 quiz = new Quiz8();

	@Test
	void quiz1() {
		assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
	}

	@Test
	void quiz2() {
		assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
	}

}
