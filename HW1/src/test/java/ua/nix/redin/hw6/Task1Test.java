package ua.nix.redin.hw6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw6.Task1.func1;
import static ua.nix.redin.hw6.Task1.func2;

class Task1Test {

    @Test
    void func1Test1() {
        double n = 16.0d;
        double actual = func1(n);
        double expected = 256.0d;
        assertEquals(expected, actual);
    }

    @Test
    void func2Test1() {
        String s = "Strange things!!!";
        String actual = func2(s);
        String expected = "!!!sgniht egnartS";
        assertEquals(expected, actual);
    }
}