package advancedMay.advanced.examPreparation.exam03.aquarium;

public class Fish {
    private String name;
    private final String color;
    private final int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getFins() {
        return fins;
    }

    @Override
    public String toString() {
        return String.format("Fish: %s%n" +
                        "Color: %s%n" +
                        "Number of fins: %d",
                this.name,
                this.color,
                this.fins);
    }
}
