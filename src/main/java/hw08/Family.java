package hw08;


import java.util.ArrayList;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    protected Set<Pet> pet;
    private ArrayList<Human> children = new ArrayList<Human>();

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;

    }

    public void addChild(Human child) {
        this.children.add(child);
        child.setFamily(this);
    }

    public void deleteChild(Human child) {
        this.children.remove(child);
        child.deleteFromFamily();


    }

    public void deletechildIndex(int index) {
        this.children.remove(children.get(index));

    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = (Set<Pet>) pet;
    }

    public Family(ArrayList<Human> children) {
        this.children = children;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        return String.format("Father{%s}\nMother{%s}\nChildren{%s}\nPet{%s}",
                this.father.toString(), this.mother.toString(), this.children.toString(), this.pet.toString());
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = result * 13 + this.father.hashCode();
        result = result * 13 + this.mother.hashCode();
        result = result * 13 + this.children.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Family)) return false;
        Family that = (Family) obj;
        return this.mother.equals(that.mother) &&
                this.father.equals(that.father) &&
                this.children.equals(that.children);
    }
}