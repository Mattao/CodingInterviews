package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q58_LeftRotateStringTest {

    private Q58_LeftRotateString leftRotateString;

    @BeforeEach
    void setUp() {
        leftRotateString = new Q58_LeftRotateString();
    }

    @Test
    void testNull() {
        Assertions.assertNull(leftRotateString.leftRotate(null, 2));
    }

    @Test
    void testEmptyString() {
        Assertions.assertEquals("", leftRotateString.leftRotate("", 2));
    }

    @Test
    void testNonRotateString() {
        Assertions.assertEquals("abc", leftRotateString.leftRotate("abc", 0));
    }

    @Test
    void testRotateString() {
        Assertions.assertEquals("bca", leftRotateString.leftRotate("abc", 1));
    }

    @Test
    void testOverRotateString() {
        Assertions.assertEquals("cab", leftRotateString.leftRotate("abc", 5));
    }
}
