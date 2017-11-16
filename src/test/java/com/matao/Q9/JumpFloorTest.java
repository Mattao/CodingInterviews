package com.matao.Q9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JumpFloorTest {

    private JumpFloor jumpFloor;

    @BeforeEach
    public void setUp() {
        jumpFloor = new JumpFloor();
    }

    @Test
    public void testFib() {
        Assertions.assertEquals(0, jumpFloor.jump(0));
        Assertions.assertEquals(1, jumpFloor.jump(1));
        Assertions.assertEquals(2, jumpFloor.jump(2));
        Assertions.assertEquals(3, jumpFloor.jump(3));
        Assertions.assertEquals(5, jumpFloor.jump(4));
        Assertions.assertEquals(8, jumpFloor.jump(5));
        Assertions.assertEquals(13, jumpFloor.jump(6));
        Assertions.assertEquals(21, jumpFloor.jump(7));
        Assertions.assertEquals(34, jumpFloor.jump(8));
        Assertions.assertEquals(55, jumpFloor.jump(9));
        Assertions.assertEquals(89, jumpFloor.jump(10));
    }
}
