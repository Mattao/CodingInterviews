package com.matao.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("test Calculator")
public class CalculatorTest {

    @Test
    @DisplayName("test Add")
    public void testAdd(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        assertEquals("test Add", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
    }
}
