package hw09;

import hw09.Animal.*;
import hw09.Family.Family;
import hw09.Family.FamilyController;
import hw09.Humans.Human;
import hw09.Humans.Man;
import hw09.Humans.Woman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    FamilyController ct = new FamilyController();
    HashMap<DayOfWeek, ArrayList<String>> schedule1=new HashMap<>();
    HashMap<DayOfWeek, ArrayList<String>> schedule2=new HashMap<>();
    HashMap<DayOfWeek, ArrayList<String>> schedule3=new HashMap<>();
    HashMap<DayOfWeek, ArrayList<String>> schedule4=new HashMap<>();
    Pet findig = new DomesticCat("findig", 1, 100, new HashSet<>(Arrays.asList("running")));
    Pet max = new Dog("max", 3, 70, new HashSet<>(Arrays.asList("eating")));
    schedule1.put(DayOfWeek.Monday, new ArrayList<>(Arrays.asList("Going to work")));
    schedule1.put(DayOfWeek.Tuesday, new ArrayList<>(Arrays.asList("Resting")));
    schedule2.put(DayOfWeek.Monday, new ArrayList<>(Arrays.asList("Cleaning home")));
    schedule2.put(DayOfWeek.Tuesday, new ArrayList<>(Arrays.asList("Getting quests")));
    schedule3.put(DayOfWeek.Monday, new ArrayList<>(Arrays.asList("Going to the course" )));
    schedule3.put(DayOfWeek.Tuesday, new ArrayList<>(Arrays.asList("doing homework")));
    schedule4.put(DayOfWeek.Monday, new ArrayList<>(Arrays.asList("going to market")));
    schedule4.put(DayOfWeek.Tuesday, new ArrayList<>(Arrays.asList("Watching a movie")));
    Human father = new Man("Fazil", "Serkhanbeyli", 110, 100, schedule1);
    Human mother = new Woman("Mother", "Surname", 110, 100, schedule2);
    Human real = new Man("Real", "Serkhanbeyli", 99, 100, schedule3);
    Human hilal = new Woman("Child2", "Surname", 101, 70, schedule4);
    Family family1 = ct.createNewFamily(father, mother);
    ct.adoptChild(family1,real);//which family,child
    System.out.println(family1.countFamily());
    ct.addPet(0,max);//index of family,pet
    System.out.println(ct.bornChild(family1,"masculine"));
    ct.deleteAllChildrenOlderThen(10);
    System.out.println(family1);
//you can use all methods. I think it will be more understandable.


  }
}
