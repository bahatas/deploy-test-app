package com.example.deploytestapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ServiceTest {
    @Test
    void testSolution() {
        assertEquals("Tue", Service.solution("foo", 1));
        assertEquals("Tue", Service.solution("Mon", 1));
    }
}

