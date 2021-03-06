package hw08;

import java.util.HashSet;

public class RoboCAt extends Pet {
    public RoboCAt(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public RoboCAt(Species species, String nickname) {
        super(species, nickname);
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

    }
}
