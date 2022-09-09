package ua.nix.redin.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw3.Task3.func;

class Task3Test {

    @Test
    void funcTest1() {
        int Class_num = 1;
        int actual = func(Class_num);
        int expected = 585;
        assertEquals(expected,actual);
    }
    @Test
    void funcTest2() {
        int Class_num = 3;
        int actual = func(Class_num);
        int expected = 695;
        assertEquals(expected,actual);
    }
    @Test
    void funcTest3() {
        int Class_num = 0;
        int actual = func(Class_num);
        int expected = 540;
        assertEquals(expected,actual);
    }
}