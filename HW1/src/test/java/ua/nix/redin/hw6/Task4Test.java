package ua.nix.redin.hw6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw6.Task4.func;

class Task4Test {

    @Test
    void funcTest1() {
        int n = 5, m= 6;
        int actual = func(n,m);
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    void funcTest2() {
        int n = 0, m= 6;
        int actual = func(n,m);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void funcTest3() {
        int n = 5, m= 0;
        int actual = func(n,m);
        int expected = 0;
        assertEquals(expected, actual);
    }
}