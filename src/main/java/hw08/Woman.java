package hw08;

import java.util.ArrayList;
import java.util.Map;

public class Woman extends Human {
    public Woman() {
        super();
    }

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, Family family, int dateOfBirth, int IQ, Map<DayofWeek, ArrayList<String>> schedule, Pet pet) {
        super(name, surname, family, dateOfBirth, IQ, schedule, pet);
    }

    public void makeUp() {
        System.out.println("Dont need make up.");
    }

    @Override
    public void greetPet() {
        System.out.printf("Hello %s.", pet.getNickname());
    }
}
