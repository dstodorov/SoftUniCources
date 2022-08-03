package advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces;

import advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {
    void addPrivate(PrivateImpl priv);
    List<PrivateImpl> getPrivates();
}
