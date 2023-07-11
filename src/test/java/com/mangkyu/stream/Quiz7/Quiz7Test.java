package com.mangkyu.stream.Quiz7;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mangkyu.stream.Quiz6.Answer6;
import com.mangkyu.stream.Quiz6.Quiz6;

class Quiz7Test {

    private final Answer7 answer = new Answer7();
    private final Quiz7 quiz = new Quiz7();

    @Test
    void quiz1() {
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @Test
    void quiz2() {
        assertThat(quiz.quiz1Another()).isEqualTo(answer.quiz1Another());
    }

}
