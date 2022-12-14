package advancedMay.advanced.javaGenerics.exercises.genericSwapMethodString;

public class Box<T> {
    private final T element;

    Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n", element.getClass().getName(), element);
    }
}
