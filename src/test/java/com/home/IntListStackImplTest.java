package com.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntListStackImplTest {

    @Test
    public void createObjectIsEmpty() {
        IntListStackImpl object = new IntListStackImpl();
        int actualResult = object.size();
        int expectedResult = 0;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void correctAddingElements() {
        IntListStackImpl object = new IntListStackImpl();
        object.add(1);
        object.add(2);
        int actualResult = object.getByIndex(0);
        int expectedResult = 1;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void correctAddingElements1() {
        IntListStackImpl object = new IntListStackImpl();
        object.add(1);
        object.add(2);
        int actualResult = object.getByIndex(1);
        int expectedResult = 2;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void correctRemoveByIndex() {
        IntListStackImpl object = new IntListStackImpl();
        for (int i = 0; i < object.capacity(); i++) {
            object.add(i);
        }
        object.removeByIndex(5);
        int actualResult = object.getByIndex(5);
        int expectedResult = 6;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void exeptionWhenIndexIsOutOfBound() {
        IntListStackImpl object = new IntListStackImpl();
        boolean thrown = false;
        try {
            object.getByIndex(111);
        } catch (ArrayIndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void sublistTest() {
        IntListStackImpl object = new IntListStackImpl();
        for (int i = 0; i < object.capacity(); i++) {
            object.add(i);
        }
        object.subList(0, 5);
        int actualResult = object.getByIndex(5);
        int expectedResult = 5;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void popTest() {
        IntListStackImpl object = new IntListStackImpl();
        for (int i = 0; i < 9; i++) {
            object.add(i);
        }
        object.pop();
        int actualResult = object.getByIndex(9);
        int expectedResult = 0;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void pushTest() {
        IntListStackImpl object = new IntListStackImpl();
        object.push(1);
        object.push(2);
        int actualResult = object.getByIndex(1);
        int expectedResult = 2;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}


