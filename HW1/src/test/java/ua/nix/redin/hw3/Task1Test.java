package ua.nix.redin.hw3;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw3.Task1.func;

class Task1Test {

    @org.junit.jupiter.api.Test
    void funcTest1() {
        String s = "s45ert7q3";
        int actual = func(s);
        int expected = 19;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void funcTest2() {
        String s = "";
        int actual = func(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void funcTest3() {
        String s = "43";
        int actual = func(s);
        int expected = 7;
        assertEquals(expected, actual);
    }
}
