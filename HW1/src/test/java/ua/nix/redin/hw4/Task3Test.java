package ua.nix.redin.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw4.Task3.func;

class Task3Test {

    @Test
    void funcTest1() {
        int [] a = new int [] {16,17,18,19};
        int actual = func(a);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void funcTest2() {
        int [] a = new int [] {19,18,17,16};
        int actual = func(a);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void funcTest3() {
        int [] a = new int [] {0,0,0,0};
        int actual = func(a);
        int expected = 0;
        assertEquals(expected, actual);
    }
}