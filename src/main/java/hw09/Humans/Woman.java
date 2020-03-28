package hw09.Humans;

import hw09.DayOfWeek;

import java.util.ArrayList;
import java.util.Map;

public final class Woman extends Human {
  public Woman() {
    super();
  }

  public Woman(String name, String surname, int dateOfBirth) {
    super(name,surname,dateOfBirth);
  }

  public Woman(String name, String surname, int dateOfBirth, int iqLevel, Map<DayOfWeek, ArrayList<String>> schedule) {
    super(name,surname,dateOfBirth,iqLevel,schedule);
  }

  public void makeUp(){
    System.out.println("I should make up...");
  }
}
