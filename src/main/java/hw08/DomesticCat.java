package hw08;

public class DomesticCat extends Pet {
    public DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public DomesticCat(Species species, String nickname) {
        super(species, nickname);
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
