package actors;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DirectorAbilitiesTest {

    @Test
    void calculateMangerKPI() {
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        int countOfSells = 5;
        int countOfWorkedDays = 10;
        Director head = new Director(1, "Vasya", "+380667908200", "vasyapupkin@gmail.com");
        head.calculateMangerKPI(man1, countOfSells, countOfWorkedDays);
        double actual = man1.getKPI();
        double expeted = 21;
        assertEquals(expeted, actual);
    }

    @Test
    void calculateProductivity() {
        Director head = new Director(1, "Vasya", "+380667908200", "vasyapupkin@gmail.com");
        ArrayList<Manager> workers = new ArrayList<>();
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        Manager man2 = new Manager(2, "Vlad", "+380665356241", "vladikkk@gmail.com");
        Manager man3 = new Manager(3, "Maks", "+380663423423", "maksickkkkk@gmail.com");
        workers.add(man1);
        workers.add(man2);
        workers.add(man3);
        man1.setKPI(21.0);
        man2.setKPI(23.0);
        man3.setKPI(34.0);
        double actual = head.calculateProductivity(workers);

        double expected = 26.0;
        assertEquals(expected, actual);
    }
}