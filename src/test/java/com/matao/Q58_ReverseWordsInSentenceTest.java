package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-05.
 */
public class Q58_ReverseWordsInSentenceTest {

    private Q58_ReverseWordsInSentence reverseWordsInSentence;

    @BeforeEach
    void setUp() {
        reverseWordsInSentence = new Q58_ReverseWordsInSentence();
    }

    @Test
    void testNull() {
        Assertions.assertNull(reverseWordsInSentence.reverse(null));
    }

    @Test
    void testEmptyString() {
        Assertions.assertEquals("", reverseWordsInSentence.reverse(""));
    }

    @Test
    void testSingleCharacterString() {
        Assertions.assertEquals("z", reverseWordsInSentence.reverse("z"));
    }

    @Test
    void testSingWord() {
        Assertions.assertEquals("cartoon", reverseWordsInSentence.reverse("cartoon"));
    }

    @Test
    void testMultipleWords() {
        Assertions.assertEquals("cat. a is This", reverseWordsInSentence.reverse("This is a cat."));
    }
}
