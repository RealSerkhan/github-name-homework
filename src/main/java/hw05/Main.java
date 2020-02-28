package hw05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] Findiqhabits = {"Sleeping", "playing", "Eating", "Meowing", "Hiding"};
        Human FazilSerkhan = new Human("Fazil", "Serkhan", 1971);
        Pet realCat = new Pet("Cat", "Findiq", 1, 90, Findiqhabits);
        Human MomSerkhan = new Human("Mom", "Serkhan", 1971);

        Family serkhans = new Family(FazilSerkhan, MomSerkhan);

        Pet HilalDog = new Pet("Dog", "Max");
        Human HilalSerkhan = new Human("Hilal", "Serkhan", 1997);
        Human ShikaliSerkhan = new Human("Shikali", "Serkhan", 1995);

        Pet OsmanDOg = new Pet();
        String[][] osmanschedule = {{"Wednesday", "Reading books"}, {"Friday", "Feeling good"}};
        Human OsmanSerkhan = new Human("Osman", "Serkhan", serkhans, 2000, 88, osmanschedule, OsmanDOg);
        System.out.println(HilalSerkhan.getFamily());
        serkhans.addChild(HilalSerkhan);
        serkhans.addChild(ShikaliSerkhan);
        serkhans.addChild(OsmanSerkhan);
        System.out.println(serkhans.countFamily());
        serkhans.deleteChild(HilalSerkhan);
        System.out.println(serkhans.countFamily());
        System.out.println(HilalSerkhan.getFamily());
        realCat.setSpecies("Cat");
        OsmanDOg.setNickname("Rune");
        OsmanDOg.setTrickLevel(79);
        OsmanDOg.setAge(2);
        OsmanDOg.setHabits(new String[]{"Sleeping", "Eating", "Hawling"});
        System.out.println(OsmanSerkhan.toString());
        OsmanSerkhan.greetPet();
        OsmanSerkhan.describePet();
        System.out.println(realCat.toString());
        realCat.respond();
        realCat.eat();
        realCat.foul();

    }
}
