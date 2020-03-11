package hw08;

import java.util.HashSet;

public class Dog extends Pet {
    public Dog(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog() {


    }

    @Override
    public void eat() {
        System.out.println("I am eating.");

    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you!\n", this.getNickname());

    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up.");

    }
}
