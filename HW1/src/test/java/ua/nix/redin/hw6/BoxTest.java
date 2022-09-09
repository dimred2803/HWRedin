package ua.nix.redin.hw6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void setValueClassBoxTest1() {
        Box b = new Box ("something");
        b.setValue("something2");
        String actual = b.getValue();
        String expected = "something2";
        assertEquals(expected, actual);
    }
}