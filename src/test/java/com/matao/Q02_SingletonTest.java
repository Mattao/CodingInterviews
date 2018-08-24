package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018/8/24.
 */
public class Q02_SingletonTest {
    private Q02_Singleton.Singleton1 singleton1;
    private Q02_Singleton.Singleton2 singleton2;
    private Q02_Singleton.Singleton3 singleton3;
    private Q02_Singleton.Singleton4 singleton4;
    private Q02_Singleton.Singleton5 singleton5;
    private Q02_Singleton.Singleton6 singleton6;
    private Q02_Singleton.Singleton7 singleton7;

    @BeforeEach
    void setUp() {
        singleton1 = Q02_Singleton.Singleton1.getInstance();
        singleton2 = Q02_Singleton.Singleton2.getInstance();
        singleton3 = Q02_Singleton.Singleton3.getInstance();
        singleton4 = Q02_Singleton.Singleton4.getInstance();
        singleton5 = Q02_Singleton.Singleton5.getInstance();
        singleton6 = Q02_Singleton.Singleton6.getInstance();
        singleton7 = Q02_Singleton.Singleton7.instance;
    }

    @Test
    void testSingleton1() {
        Assertions.assertEquals(singleton1, Q02_Singleton.Singleton1.getInstance());
    }

    @Test
    void testSingleton2() {
        Assertions.assertEquals(singleton2, Q02_Singleton.Singleton2.getInstance());
    }

    @Test
    void testSingleton3() {
        Assertions.assertEquals(singleton3, Q02_Singleton.Singleton3.getInstance());
    }

    @Test
    void testSingleton4() {
        Assertions.assertEquals(singleton4, Q02_Singleton.Singleton4.getInstance());
    }

    @Test
    void testSingleton5() {
        Assertions.assertEquals(singleton5, Q02_Singleton.Singleton5.getInstance());
    }

    @Test
    void testSingleton6() {
        Assertions.assertEquals(singleton6, Q02_Singleton.Singleton6.getInstance());
    }

    @Test
    void testSingleton7() {
        Assertions.assertEquals(singleton7, Q02_Singleton.Singleton7.instance);
    }
}
