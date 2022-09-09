package ua.nix.redin.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw4.Task2.func;

class Task2Test {

    @Test
    void funcTest1() {
        int [] a = new int [] {2,1,7,9,8,9,6,10};
        int [] actual = func(a);
        int [] expected = {2,0,7,0,8,0,6,0};
        assertArrayEquals(expected, actual);
    }
}