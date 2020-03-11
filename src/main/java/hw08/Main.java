package hw08;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human fazilSerkhan = new Man("Fazil", "Serkhan", 1971);
        Pet realCat = new DomesticCat(Species.DomesticCat, "Findiq", 1, 90,  new HashSet<>(Arrays.asList("Sleeping", "playing", "Eating", "Meowing", "Hiding")));
        Human momSerkhan = new Woman("Mom", "Serkhan", 1971);
        Family serkhans = new Family(fazilSerkhan, momSerkhan);
        Human hilalSerkhan = new Man("Hilal", "Serkhan", 1997);
        Pet osmanDOg = new Dog();
        HashMap<DayofWeek,ArrayList<String>> kvHashMap = new HashMap<>();
        kvHashMap.put(DayofWeek.Monday, new ArrayList<>(Arrays.asList("sleeping in the real life...")));
        Human osmanSerkhan = new Man("Osman", "Serkhan", serkhans, 2000, 88, kvHashMap, osmanDOg);
        System.out.println(hilalSerkhan.getFamily());
        serkhans.addChild(hilalSerkhan);
        System.out.println(serkhans.countFamily());
        serkhans.deleteChild(hilalSerkhan);
        System.out.println(serkhans.countFamily());
        System.out.println(hilalSerkhan.getFamily());
        realCat.setSpecies(Species.DomesticCat);
        osmanDOg.setNickname("Rune");
        System.out.println(osmanSerkhan.toString());
        osmanSerkhan.greetPet();
        osmanSerkhan.describePet();
        System.out.println(realCat.toString());
        realCat.respond();
        realCat.eat();
        realCat.foul();

    }
}
