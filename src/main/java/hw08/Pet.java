package hw08;

import java.util.HashSet;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits=new HashSet<>();

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }

    public Pet() {
    }


    public abstract void eat();

    public abstract void respond();

    public abstract void foul();

    public String toString() {
        return species + "{nickname= " + this.nickname + ", age=" + this.age + ", trickLevel=" + this.trickLevel +
                ", habits=" + habits.toString() + "}";
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = result * 31 + this.nickname.hashCode();
        result = result * 31 + this.age;
        result = result * 31 + this.trickLevel;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Pet)) return false;
        Pet that = (Pet) obj;
        return this.nickname.equals(that.nickname) &&
                this.age == that.age &&
                this.trickLevel == that.trickLevel;
    }

}