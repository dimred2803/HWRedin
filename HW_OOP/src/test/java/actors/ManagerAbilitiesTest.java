package actors;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import static org.junit.jupiter.api.Assertions.*;

class ManagerAbilitiesTest {

    @Test
    void setClientRank() {
        Client cl1 = new Client(1, "Dima", "+380957223355", "dimredin@gmail.com", "3454355");
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        man1.setClientRank(cl1,3);
        int actual = cl1.getRank();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void modifyCatalog() {
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        ArrayList<UnitOfProduction> catalog = new ArrayList<>();
        catalog.add (new UnitOfProduction(1,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(2,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(3,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(4,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(5,"something1", "something2", "something3"));
        man1.modifyCatalog(catalog, 345,"something1", "something2", "something3");
        boolean actual = false;
        for (UnitOfProduction i : catalog) {
            if (i.getUnitIndex() == 345)
                actual = true;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void deleteUnit() throws ConcurrentModificationException {
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        ArrayList<UnitOfProduction> catalogBefore = new ArrayList<>();
        ArrayList<UnitOfProduction> catalogAfter;
        catalogBefore.add (new UnitOfProduction(1,"something1", "something2", "something3"));
        catalogBefore.add (new UnitOfProduction(2,"something1", "something2", "something3"));
        catalogAfter = man1.deleteUnit(catalogBefore, 1);
        boolean actual = true;
        for (UnitOfProduction i : catalogAfter) {
            if (i.getUnitIndex() == 1)
                actual = false;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }
}