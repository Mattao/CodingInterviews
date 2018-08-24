package com.matao.Q4;

import com.matao.Q05_ReplaceSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplaceSpacesTest {

    private Q05_ReplaceSpaces replaceSpaces;

    @BeforeEach
    public void setUp() {
        replaceSpaces = new Q05_ReplaceSpaces();
    }

    @Test
    public void testSpaceInMiddleString() {
        String str = "we are happy.";
        Assertions.assertEquals("we%20are%20happy.", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testSpaceInFrontString() {
        String str = " helloworld";
        Assertions.assertEquals("%20helloworld", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testSpaceInEndString() {
        String str = "helloworld ";
        Assertions.assertEquals("helloworld%20", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testContinuousSpaceString() {
        String str = "hello  world";
        Assertions.assertEquals("hello%20%20world", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testSpaceOnlyString() {
        String str = " ";
        Assertions.assertEquals("%20", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testEmptyString() {
        String str = "";
        Assertions.assertEquals("", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testNonSpaceString() {
        String str = "matao";
        Assertions.assertEquals("matao", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testAllSpacesString() {
        String str = "     ";
        Assertions.assertEquals("%20%20%20%20%20", replaceSpaces.replaceBlank(str));
    }

    @Test
    public void testNullString() {
        String str = null;
        Assertions.assertNull(replaceSpaces.replaceBlank(str));
    }
}
