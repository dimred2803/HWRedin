package ua.nix.redin.hw3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static ua.nix.redin.hw3.Task2.func;

class Task2Test {

    @Test
    void funcTest1() {
        String s = "qt34tte6";
        Map<Character, Integer> actual = func(s);
        Map<Character, Integer> expected = new HashMap<>() {{
            put('q', 1);
            put('t', 3);
            put('e', 1);
        }};
        assertEquals(expected, actual);
    }
}