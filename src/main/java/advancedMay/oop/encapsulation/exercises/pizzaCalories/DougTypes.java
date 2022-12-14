package advancedMay.oop.encapsulation.exercises.pizzaCalories;

public enum DougTypes {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private final double modifier;

    DougTypes(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
