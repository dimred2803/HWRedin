package actors;

import actors.Manager;

import java.util.Collection;

public interface DirectorAbilities {
    void printInfo();
    void calculateMangerKPI (Manager m, int countOfSells, int countOfWorkedDays);
    double calculateProductivity (Collection<? extends Manager> workers);
}