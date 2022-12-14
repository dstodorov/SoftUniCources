package advancedMay.oop.interfacesAndAbstraction.lab.ferrari;

public class Ferrari implements Car {
    private final String driverName;
    private final String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = Car.MODEL;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", MODEL, brakes(), gas(), this.driverName);
    }
}
