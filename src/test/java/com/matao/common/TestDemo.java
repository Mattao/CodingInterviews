package com.matao.common;

import org.junit.jupiter.api.*;

public class TestDemo {

    @Test
    void testCalcOne() {
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    void testCalcTwo() {
        Assertions.assertEquals(6, 2 + 4);
    }
}
