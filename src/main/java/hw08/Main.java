package hw08;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[] findiqhabits = {"Sleeping", "playing", "Eating", "Meowing", "Hiding"};
        Human fazilSerkhan = new Man("Fazil", "Serkhan", 1971);
        Pet realCat = new DomesticCat(Species.DomesticCat, "Findiq", 1, 90,  new HashSet<>(Arrays.asList("Sleeping", "playing", "Eating", "Meowing", "Hiding")));
        Human momSerkhan = new Woman("Mom", "Serkhan", 1971);
        Family serkhans = new Family(fazilSerkhan, momSerkhan);
        Pet hilalDog = new Dog(Species.Dog, "Max");
        Human hilalSerkhan = new Man("Hilal", "Serkhan", 1997);
        Human shikaliSerkhan = new Man("Shikali", "Serkhan", 1995);
        Pet osmanDOg = new Dog();
        HashMap<DayofWeek,ArrayList<String>> kvHashMap = new HashMap<>();
        kvHashMap.put(DayofWeek.Monday, new ArrayList<>(Arrays.asList("Sleeping", "playing", "Eating", "Meowing", "Hiding")));
        Human osmanSerkhan = new Man("Osman", "Serkhan", serkhans, 2000, 88, kvHashMap, osmanDOg);
        Human noone = new Man("Nobody", "NUll", 1900);
        System.out.println(hilalSerkhan.getFamily());
        serkhans.addChild(hilalSerkhan);
        serkhans.addChild(shikaliSerkhan);
        serkhans.addChild(osmanSerkhan);
        serkhans.addChild(noone);
        System.out.println(serkhans.countFamily());
        serkhans.deleteChild(hilalSerkhan);
        System.out.println(serkhans.countFamily());
        System.out.println(hilalSerkhan.getFamily());
        realCat.setSpecies(Species.DomesticCat);
        osmanDOg.setNickname("Rune");
        osmanDOg.setTrickLevel(79);
        osmanDOg.setAge(2);
        System.out.println(osmanSerkhan.toString());
        osmanSerkhan.greetPet();
        osmanSerkhan.describePet();
        System.out.println(realCat.toString());
        realCat.respond();
        realCat.eat();
        realCat.foul();

    }
}
