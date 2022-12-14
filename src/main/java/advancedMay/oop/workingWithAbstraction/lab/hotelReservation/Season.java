package advancedMay.oop.workingWithAbstraction.lab.hotelReservation;

public enum Season {
    AUTUMN("Autumn", 1),
    SPRING("Spring", 2),
    WINTER("Winter", 3),
    SUMMER("Summer", 4);

    private final String season;
    private final int multiplier;

    Season(String season, int multiplier) {
        this.season = season;
        this.multiplier = multiplier;
    }

    public String getSeason() {
        return season;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
