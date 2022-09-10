package launcher;

import actors.Client;
import actors.Director;
import actors.Manager;
import actors.UnitOfProduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URL;
import java.util.ArrayList;

public class Launcher {
    private static final Logger log = LoggerFactory.getLogger(Launcher.class);
    public static void main(String[] args) {

        // Let's create three clients
        log.info("something");
        Client cl1 = new Client(1, "Dima", "+380957223355", "dimredin@gmail.com", "3454355");
        Client cl2 = new Client(2, "Roma", "+380955673988", "romanpev@gmail.com", "3454343");
        Client cl3 = new Client(3, "Nikita", "+380952348765", "nikitakozin@gmail.com", "34512222");
        // Let's create one manager
        ArrayList<Manager> workers = new ArrayList<>();
        Manager man1 = new Manager(1, "Viktor", "+380667111222", "redinvu@gmail.com");
        Manager man2 = new Manager(2, "Vlad", "+380665356241", "vladikkk@gmail.com");
        Manager man3 = new Manager(3, "Maks", "+380663423423", "maksickkkkk@gmail.com");

        // Let's create one director
        Director head = new Director(1, "Vasya", "+380667908200", "vasyapupkin@gmail.com");
        // Let's create first production catalog
        ArrayList <UnitOfProduction> catalog = new ArrayList<>();
        catalog.add (new UnitOfProduction(1,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(2,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(3,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(4,"something1", "something2", "something3"));
        catalog.add (new UnitOfProduction(5,"something1", "something2", "something3"));

        // Let's test one of the functions of Manager.
        // He can add new unit of production to the catalog.
        // Also he can delete unit of production from the catalog.
        // First, we delete unit with index 4. Instead of it we add unit with index 6.
                System.out.println("Order (made by cl1) : ");
        int [] wishes = new int [] {1,3,5};
        ArrayList<UnitOfProduction> order = cl1.MakeOrder(wishes, catalog);
        for (UnitOfProduction unit : order) {
            unit.printInfoAboutUnit();
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
        }

        // Also, Manager can set the rank of Client.
        man1.setClientRank(cl1, 5);
        cl1.printInfo();

        // Next function allows Director to calculate Manager KPI.
        head.calculateMangerKPI(man1,5, 4);
        head.calculateMangerKPI(man2,3, 6);
        head.calculateMangerKPI(man3,2, 7);
        workers.add(man1);
        workers.add(man2);
        workers.add(man3);

        // Moreover, Director can calculate total KPI of selling departure.
        System.out.println("Total KPI : " + head.calculateProductivity(workers));

    }
}
