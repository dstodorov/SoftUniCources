package advancedMay.oop.workingWithAbstraction.exercises.trafficLights;

public enum TrafficLightSignals {
    RED(0),
    GREEN(1),
    YELLOW(2);

    private final int intValue;

    TrafficLightSignals(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

}
