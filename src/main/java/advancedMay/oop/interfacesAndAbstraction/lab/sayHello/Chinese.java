package advancedMay.oop.interfacesAndAbstraction.lab.sayHello;

public class Chinese implements Person {
    private final String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}