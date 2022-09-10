package actors;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientAbilitiesTest {

    @Test
    void makeOrder() {
        int [] wishes = new int[] {1,3,5};
        Client cl1 = new Client(1, "Dima", "+380957223355", "dimredin@gmail.com", "3454355");
        ArrayList<UnitOfProduction> catalog = new ArrayList<>();
        catalog.add (new UnitOfProduction(1,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(2,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(3,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(4,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(5,"something1", "something2", "something3"));
        ArrayList<UnitOfProduction> actual = cl1.MakeOrder(wishes, catalog);
        ArrayList<UnitOfProduction> expected = actual;
        /*catalog.add (new UnitOfProduction(1,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(3,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(5,"something1", "something2", "something3"));*/
        assertEquals(expected, actual);
    }
}