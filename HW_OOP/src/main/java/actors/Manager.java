package actors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Manager extends Actor implements ManagerAbilities {
    private static final Logger logger = LoggerFactory.getLogger(Manager.class);
    private double KPI = 100;

    public Manager (int index, String personName, String phoneNumber, String eMail) {
        super(index, personName, phoneNumber, eMail);
        this.setStatusName("Manager");
    }
    @Override
    public void printInfo() {
        System.out.println("Information about manager:");
        System.out.println("Manager index : " + this.getIndex());
        System.out.println("Manager name : " + this.getPersonName());
        System.out.println("Manager phone number : " + this.getPhoneNumber());
        System.out.println("Manager e-mail : " + this.geteMail());
        System.out.println("Manager current KPI : " + this.getKPI());
    }

    public double getKPI () {
        return this.KPI;
    }

    public void setKPI (double KPIValue) {
        this.KPI = KPIValue;
    }

    public void setClientRank(Client c, int rankValue) {
        c.setRank(rankValue);
        //logger.info ("New rankValue was set!!!");
    }
    public ArrayList<UnitOfProduction> modifyCatalog (ArrayList<UnitOfProduction> catalog, int index,
                                                      String UnitName, String UnitType, String ScopeOfUse ) {
        catalog.add(new UnitOfProduction(index, UnitName, UnitType, ScopeOfUse));
        return catalog;
    }

    public ArrayList<UnitOfProduction> deleteUnit(ArrayList<UnitOfProduction> catalog, int index) {
        for (UnitOfProduction unit : catalog)
            if (unit.getUnitIndex() == index)
                catalog.remove (index-1);
        return catalog;
    }
    @Override
    protected void finalize ()  {
        logger.info ("Manager was deleted!!!");
    }
}