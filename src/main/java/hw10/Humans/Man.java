package hw10.Humans;

import hw10.DayOfWeek;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

public final class Man extends Human {
  public Man() {
    super();
  }

  public Man(String name, String surname, int dateOfBirth) throws ParseException {
    super(name,surname,dateOfBirth);
  }

  public Man(String name, String surname, String dateOfBirth, int iqLevel, Map<DayOfWeek, ArrayList<String>> schedule) throws ParseException {
    super(name,surname,dateOfBirth,iqLevel,schedule);
  }

  public void repairCar(){
    System.out.println("need to repair it...");
  }

}