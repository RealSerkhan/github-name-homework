package hw04;

public class Human {

    String name;
    String surname;
    int year;
    int IQ_level;
    Pet pet;
    Human mother;
    Human father;
    public Human(){

    }
    public Human(String name,String surname,int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name,String surname,int year,Human mother,Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;
    }

    public Human(String name, String surname, int year, int IQ_level, Pet pet, Human mother, Human father,String schdule[]) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ_level = IQ_level;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    //    (greetPet)("Hello, [the name of the pet]")
    public void greetPet(){
        System.out.println("Hello "+pet.nickname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", IQ_level=" + IQ_level +
                ", pet=" + pet.species+ "{nickname: " +pet.nickname + ", Age: " +pet.age + ", Tricklevel: "+pet.tricklevel + ", Habits: "+pet.habits+
                ", mother=" + mother.name +
                ", father=" + father.name +

                '}';
    }
}
