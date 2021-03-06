package hw06;


import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int IQ;
    private String schedule[][];
    private Family family;
    private Pet pet;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getIqLevel() {
        return IQ;
    }
    public void setIqLevel(int IQ) {
        this.IQ = IQ;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void deleteFromFamily(){
        this.family = null;
    }

    public Human() {
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.setName(name);
        this.setSurname(surname);
        this.setDateOfBirth(dateOfBirth);
    }

    public Human(String name, String surname, Family family, int dateOfBirth, int IQ, String schedule[][], Pet pet) {
        this.name = name;
        this.surname = surname;
        this.family = family;
        this.dateOfBirth = dateOfBirth;
        this.IQ = IQ;
        this.schedule = schedule;
        this.pet = pet;
    }

    public void greetPet(){
        System.out.printf("Hello, %s.\n", pet.getNickname());
    }
    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s.\n"
                , pet.getSpecies(), pet.getAge(), pet.getTrickLevel() >50 ? "very sly" : "almost not sly");
    }

    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, IQ=%d, schedule= %s",
                this.getName(), this.getSurname(),this.getDateOfBirth(), this.getIqLevel(), Arrays.deepToString(this.schedule));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result*23 + this.name.hashCode();
        result = result*23 + this.surname.hashCode();
        result = result*23 + this.dateOfBirth;
        result = result*23 + this.IQ;
        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Human)) {
            return false;
        }
        Human that = (Human) o;
        return that.name.equals(this.name) &&
                that.surname.equals(this.surname) &&
                that.dateOfBirth == this.dateOfBirth &&
                that.family.equals(this.family) &&
                that.IQ == this.IQ;
    }
}
