package actors;

import actors.UnitOfProduction;


import java.util.ArrayList;

public interface ClientAbilities {
    void printInfo ();
    ArrayList<UnitOfProduction> MakeOrder (int [] wishes, ArrayList<UnitOfProduction> catalog);
}