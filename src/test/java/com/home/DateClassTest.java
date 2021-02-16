package com.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateClassTest {

    @Test
    public void method1() {
        String actualResult = DateClass.firstmethod();
        String expectedResult = "74 hours 10 minutes 37 seconds";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void method2() {
        String actualResult = DateClass.secondmethod();
        String expectedResult = "120 minutes 25 seconds";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void method3() {
        String actualResult = DateClass.thirdmethod();
        String expectedResult = "1999-06-18T07:34:56";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void method4() {
        String actualResult = DateClass.fourthmethod();
        String expectedResult = "23:56 2001/12/01";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
