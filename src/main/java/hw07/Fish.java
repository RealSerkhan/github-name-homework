package hw07;

public class Fish extends Pet {
    private Species species;
    public Fish( String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
        speciess=species.Fish.name();
    }

    public Fish( String nickname) {
        super( nickname);
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
