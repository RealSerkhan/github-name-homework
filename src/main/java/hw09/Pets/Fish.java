package hw09.Pets;

import java.util.HashSet;

public class Fish extends Pet {

  public Fish() {
    super();
    this.species = Species.Fish;
  }

  public Fish(String nickname) {
    super(nickname);
    this.species = Species.Fish;
  }

  public Fish(String nickname, int age, int trickLevel, HashSet<String> habits) {
    super(nickname, age, trickLevel, habits);
    this.species = Species.Fish;
  }

  @Override
  protected void respond() {
    System.out.printf("Hello, owner. I am %s. I miss you!\n", nickname);
  }

  @Override
  protected void foul() {
      System.out.println("I need to cover it up.");
  }
}
