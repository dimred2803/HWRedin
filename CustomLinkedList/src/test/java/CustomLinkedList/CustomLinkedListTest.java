package CustomLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {
    @Test
    void getElementValueByIndex1() {
        CustomLinkedList<Integer> test = new CustomLinkedList<Integer>();
        test.add(5);
        test.add(3);
        test.add(99);
        int actual = test.getElementValueByIndex(0);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void getElementValueByIndex2() {
        CustomLinkedList<Integer> test = new CustomLinkedList<Integer>();
        test.add(5);
        test.add(3);
        test.add(99);
        Integer actual = test.getElementValueByIndex(99);
        Integer expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void checkElementPresenceByValue1() {
        CustomLinkedList<String> test = new CustomLinkedList<String>();
        test.add("Vasya");
        test.add("Dima");
        test.add("Roman");
        test.add("Bogdan");
        boolean actual = test.CheckElementPresenceByValue("Roman");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void checkElementPresenceByValue2() {
        CustomLinkedList<Integer> test = new CustomLinkedList<Integer>();
        test.add(5);
        test.add(3);
        test.add(99);
        boolean actual = test.CheckElementPresenceByValue(999);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}