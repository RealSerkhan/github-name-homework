package hw07;

public class Dog extends Pet {
    private Species species;
    public Dog( String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
        speciess=species.Dog.name();
    }

    public Dog( String nickname) {
        super( nickname);

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
