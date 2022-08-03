package advancedMay.advanced.definingClasses.exercises.carSalesman;

public class Engine {
    //Mandatory fields
    private final String model;
    private final int power;
    //Optional fields
    private final String displacement;
    private final String efficiency;

    public Engine(String model, int power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s", this.model, this.power, this.displacement, this.efficiency);
    }
}
