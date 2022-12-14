package advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

import advancedMay.oop.polymorphism.exercises.wildFarm.AnimalSound;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.ZEBRA.getSound());
    }
    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }


}
