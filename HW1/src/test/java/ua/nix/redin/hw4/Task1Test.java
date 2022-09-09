package ua.nix.redin.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw4.Task1.func;

class Task1Test {

    @Test
    void funcTest1() {
        int [] a = new int [] {-4, 11, 9, -3, -10, 2, 9, 7, 6, -15, -11, -12};
        int [] actual = func(a);
        int [] expected = {11, 1};
        assertArrayEquals(expected,actual);
    }
}