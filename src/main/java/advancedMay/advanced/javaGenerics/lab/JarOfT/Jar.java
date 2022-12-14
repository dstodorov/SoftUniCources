package advancedMay.advanced.javaGenerics.lab.JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {

    private final ArrayDeque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        elements.push(element);
    }

    public T remove() {
        return this.elements.pop();
    }
}
