package actors;

import actors.UnitOfProduction;
import actors.Client;

import java.util.ArrayList;

public interface ManagerAbilities {
    void printInfo();
    void setClientRank (Client c, int rankValue);
    ArrayList<UnitOfProduction> modifyCatalog (ArrayList<UnitOfProduction> catalog, int index,
                                               String UnitName, String UnitType, String ScopeOfUse );
    ArrayList<UnitOfProduction> deleteUnit (ArrayList<UnitOfProduction> catalog, int index);

}