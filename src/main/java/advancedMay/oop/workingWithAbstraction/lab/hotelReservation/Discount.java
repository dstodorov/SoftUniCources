package advancedMay.oop.workingWithAbstraction.lab.hotelReservation;

public enum Discount {
    VIP("VIP", 0.2),
    SECOND_VISIT("SecondVisit", 0.1),
    NONE("None", 0.0);
    private final String type;
    private final double discount;

    Discount(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }
}
