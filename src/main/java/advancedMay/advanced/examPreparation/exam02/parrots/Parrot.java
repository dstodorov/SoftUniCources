package advancedMay.advanced.examPreparation.exam02.parrots;

public class Parrot {
    private final String name;
    private final String species;
    private boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Parrot (" + this.species + "): " + this.name;
    }
}
