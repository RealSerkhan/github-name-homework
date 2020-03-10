package hw07;

public class Dog extends Pet {
    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void respond() {

    }

    @Override
    public void foul() {

    }
}
