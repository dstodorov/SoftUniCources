package advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces;

import advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
