package advancedMay.oop.polymorphism.exercises.wildFarm;

public enum AnimalSound {
    CAT("Meowwww"),
    TIGER("ROAAR!!!"),
    MOUSE("SQUEEEAAAK!"),
    ZEBRA("Zs");
    private final String sound;

    AnimalSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
