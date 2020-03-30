package hw11.DAO;

import hw11.Humans.Human;
import hw11.Humans.Man;
import hw11.Humans.MasculineName;
import hw11.Humans.Woman;
import hw11.Pets.Pet;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
  private FamilyDao<Family> dao = new CollectionFamilyDao();

  public List<Family> getAllFamilies() {
    return dao.getAllFamilies();
  }

  public void displayAllFamilies() {
    System.out.println(getAllFamilies());
  }

  public void getFamiliesBiggerThan(int number) {
    System.out.println(getAllFamilies().stream().filter(x -> x.countFamily() > number).collect(Collectors.toList()));
  }

  public void getFamiliesLessThan(int number) {
    System.out.println(getAllFamilies().stream().filter(x -> x.countFamily() < number).collect(Collectors.toList()));
  }

  public long countFamiliesWithMemberNumber(int number) {
    return getAllFamilies().stream().filter(x -> x.countFamily() == number).count();
  }

  public Family createNewFamily(Human father, Human mother) {
    Family family = new Family(father, mother);
    dao.saveFamily(family);
    return family;
  }

  public boolean deleteFamilyByIndex(int index) {
    return dao.deleteFamily(index);
  }

  public Family bornChild(Family family, String gender) throws ParseException {
    Human child;
    if (gender.equals("masculine")) {
      child = new Man(MasculineName.randomName().name(), family.getFather().getSurname(), LocalDateTime.now().getYear());
    } else {
      child = new Woman(MasculineName.randomName().name(), family.getFather().getSurname(), LocalDateTime.now().getYear());
    }

    family.addChild(child);
    dao.saveFamily(family);
    return family;
  }

  public Family adoptChild(Family family, Human child) {
    family.addChild(child);
    dao.saveFamily(family);
    return family;
  }

  public void deleteAllChildrenOlderThen(int age) {
    List<Family> allFamilies = dao.getAllFamilies();
    for (Family all : allFamilies) {
      ArrayList<Human> children = new ArrayList<>(all.getChildren());
      children.stream().filter(c -> c.getAge() > age).forEach(all::deleteChild);
      dao.saveFamily(all);
    }
  }

  public int count() {
    return getAllFamilies().size();
  }

  public Family getFamilyById(int index) {
    return dao.getFamilyByIndex(index);
  }

  public List<Pet> getPets(int index) {
    return new ArrayList<>(getFamilyById(index).getPet());
  }

  public void addPet(int index, Pet pet) {
    dao.getFamilyByIndex(index).getPet().add(pet);
    dao.saveFamily(dao.getFamilyByIndex(index));
  }
}
