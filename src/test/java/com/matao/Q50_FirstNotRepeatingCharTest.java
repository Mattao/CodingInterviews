package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q50_FirstNotRepeatingCharTest {

    private Q50_FirstNotRepeatingChar firstNotRepeatingChar;

    @BeforeEach
    void setUp() {
        firstNotRepeatingChar = new Q50_FirstNotRepeatingChar();
    }

    @Test
    void test() {
        Assertions.assertEquals('b', firstNotRepeatingChar.firstNotRepeatingChar("abaccdeff"));
    }

    @Test
    void testNull() {
        Assertions.assertEquals('\77', firstNotRepeatingChar.firstNotRepeatingChar(null));
    }
}
