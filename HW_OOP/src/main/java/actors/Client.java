package actors;
import actors.Actor;
import actors.UnitOfProduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Client  extends Actor implements ClientAbilities {
    private static final Logger logger = LoggerFactory.getLogger(Client.class.getName());
    private String EDRPOU;
    private int rank = 1;

    public Client (int index, String personName, String phoneNumber,String eMail, String EDRPOU) {
        super(index, personName, phoneNumber,eMail);
        this.setStatusName("Client");
        this.EDRPOU = EDRPOU;
        logger.info ("New Client was created!!!");
    }

    @Override
    public void printInfo() {
        System.out.println("Information about client:");
        System.out.println("Client index : " + this.getIndex());
        System.out.println("Client name : " + this.getPersonName());
        System.out.println("Client phone number : " + this.getPhoneNumber());
        System.out.println("Client e-mail : " + this.geteMail());
        System.out.println("Client rank value : " + this.rank);
    }

    public int getRank () {
        return this.rank;
    }
    public void setRank (int rankValue) {
        this.rank = rankValue;
        logger.info ("New rankValue was set!!! Client with index : " + this.getIndex() + "| Address : " + this);
    }
    public String getEDRPOU () {
        return EDRPOU;
    }
    public void setEDRPOU (String EDRPOUValue) {
        this.EDRPOU = EDRPOUValue;
        logger.info ("new EDRPOUvalue was set!!!Client with index : " + this.getIndex() + "| Address : " + this);
    }

    public ArrayList<UnitOfProduction> MakeOrder (int [] wishes, ArrayList<UnitOfProduction> catalog) {
        ArrayList<UnitOfProduction> order = new ArrayList<>();
        for (int i : wishes)
            for (UnitOfProduction unit : catalog)
                if (unit.getUnitIndex()==i)
                    order.add(unit);


        return order;
    }
    @Override
    protected void finalize ()  {
        logger.info ("Client was deleted!!!");
    }
}