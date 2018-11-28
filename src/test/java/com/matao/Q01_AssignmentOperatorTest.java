package com.matao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018-11-28.
 */
public class Q01_AssignmentOperatorTest {

    private Q01_AssignmentOperator.MyString s1;
    private Q01_AssignmentOperator.MyString s2;
    private Q01_AssignmentOperator.MyString s3;

    @BeforeEach
    void setUp() {
        s1 = new Q01_AssignmentOperator.MyString("aa");
        s2 = new Q01_AssignmentOperator.MyString("bb");
        s3 = new Q01_AssignmentOperator.MyString("cc");
    }

    @Test
    void test() {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.assign(s2).assign(s3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
