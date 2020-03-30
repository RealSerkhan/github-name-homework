package hw10.Humans;

import hw10.DayOfWeek;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

public final class Woman extends Human {
  public Woman() {
    super();
  }

  public Woman(String name, String surname, int dateOfBirth) throws ParseException {
    super(name,surname,dateOfBirth);
  }

  public Woman(String name, String surname, String dateOfBirth, int iqLevel, Map<DayOfWeek, ArrayList<String>> schedule) throws ParseException {
    super(name,surname,dateOfBirth,iqLevel,schedule);
  }

  public void makeUp(){
    System.out.println("I should make up...");
  }
}
