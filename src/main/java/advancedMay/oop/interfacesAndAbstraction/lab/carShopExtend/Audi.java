package advancedMay.oop.interfacesAndAbstraction.lab.carShopExtend;

public class Audi extends CarImpl implements Rentable {
    private final Integer minRentDay;
    private final Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Minimum rental period of %s days. Price per day %f", this.minRentDay, this.pricePerDay);
    }
}
