package com.example.spring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultApplicationContextTest {

    @DisplayName("getBean으로 bean을 조회하면 bean이 반화된다.")
    @Test
    void test(){
        final var sut = new DefaultApplicationContext();

        final CandidateModule bean =  sut.getBean("CandidateModule", CandidateModule.class);
        assertNotNull(bean);
    }
}
