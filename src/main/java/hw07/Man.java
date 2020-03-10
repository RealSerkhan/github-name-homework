package hw07;

public class Man extends Human {
    private Pet pet;
    public Man() {
        super();
    }

    public Man(String name, String surname, int dateOfBirth) {
        super(name,surname,dateOfBirth);
    }

    public Man(String name, String surname, Family family, int dateOfBirth, int IQ, String schedule, Pet pet) {
        super(name, surname, family, dateOfBirth, IQ, schedule, pet);
    }
    public void repairCar(){
        System.out.println("Need to go Usta");
    }

    @Override
    public void greetPet(){
        System.out.printf("Hello, %s.\n", this.pet.getNickname());
    }
}
