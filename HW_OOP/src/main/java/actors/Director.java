package actors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class Director extends Actor implements DirectorAbilities {
    private static final Logger logger = LoggerFactory.getLogger(Director.class);
    public Director (int index, String personName, String phoneNumber, String eMail) {
        super(index, personName, phoneNumber, eMail);
        this.setStatusName("Director");
    }
    @Override
    public void printInfo() {
        System.out.println("Information about director :");
        System.out.println("Director index : " + this.getIndex());
        System.out.println("Director name : " + this.getPersonName());
        System.out.println("Director phone number : " + this.getPhoneNumber());
        System.out.println("Director e-mail: " + this.geteMail());
    }

    public void calculateMangerKPI (Manager m, int countOfSells, int countOfWorkedDays) {
        m.setKPI(countOfSells*1.8 + countOfWorkedDays*1.2);
    }

    public double calculateProductivity (Collection<? extends Manager> workers)  {
        double res = 0.0d;
        for (Manager actor : workers)
            res+=actor.getKPI();
        return res/workers.size();
    }
    @Override
    protected void finalize ()  {
        logger.info ("Director was deleted!!!");
    }
}