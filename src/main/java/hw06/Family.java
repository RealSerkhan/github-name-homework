package hw06;


import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    //    private ArrayList<Human> children = new ArrayList<Human>();
    Human[] children = new Human[0];

    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;

    }

    public void addChild(Human child) {
        int a = children.length;

        Human[] child1 = new Human[a + 1];
//        for (int i = 0; i < (a+1); i++) {
//            child1[i] = children[i];
//        }
        child1[a] = child;
        this.children = child1;
        child.setFamily(this);
    }

    public void deleteChild(Human child) {
//        this.children.remove(child);
        try {
            int a = children.length;
            Human[] child1 = new Human[a - 1];
            for (int i = 0; i < a - 1; i++) {
                if (!child.equals(children[i])) {
                    child1[i] = children[i];
                }


            }
            children = child1;
            child.deleteFromFamily();
        } catch (Exception e) {
            System.out.println(child.getName() + " is not in Family");
        }


    }

    public void deleteChild(int index) {
        int a = children.length;
        Human[] child1 = new Human[a - 1];
        for (int i = 0; i < a - 1; i++) {
            if (index != i) {
                child1[i] = children[i];
            }
        }
        children = child1;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return this.children;
    }


    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return String.format("Father{%s}\nMother{%s}\nChildren{%s}\nPet{%s}",
                this.father.toString(), this.mother.toString(), this.children.toString(), this.pet.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                Arrays.equals(children, family.children) &&
                pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}