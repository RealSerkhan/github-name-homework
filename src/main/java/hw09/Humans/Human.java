package hw09.Humans;

import hw09.DayOfWeek;
import hw09.DAO.Family;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

public abstract class Human {
  private String name;
  private String surname;
  private int dateOfBirth;
  private int iqLevel;
  private Map<DayOfWeek, ArrayList<String>> schedule;
  private Family family;


  public Human() {
  }

  public Human(String name, String surname, int dateOfBirth) {
    this.setName(name);
    this.setSurname(surname);
    this.setDateOfBirth(dateOfBirth);
  }

  public Human(String name, String surname, int dateOfBirth, int iqLevel, Map<DayOfWeek, ArrayList<String>> schedule) {
    this.name = name;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    this.iqLevel = iqLevel;
    this.schedule = schedule;

  }

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
  public int getIqLevel() {
    return iqLevel;
  }
  public void setIqLevel(int iqLevel) {
    this.iqLevel = iqLevel;
  }
  public int getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public Map<DayOfWeek, ArrayList<String>> getSchedule() {
    return schedule;
  }
  public void setSchedule(Map<DayOfWeek, ArrayList<String>> schedule) {
    this.schedule = schedule;
  }
  public int getAge(){
    return LocalDateTime.now().getYear() - this.dateOfBirth;
  }

  public void deleteFromFamily(){
    this.family = null;
  }


  @Override
  public String toString() {
    return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule= %s",
            this.getName(), this.getSurname(),this.getDateOfBirth(), this.getIqLevel(), schedule);
  }


  @Override
  public int hashCode() {
    int result = 17;
    result = result*23 + this.name.hashCode();
    result = result*23 + this.surname.hashCode();
    result = result*23 + this.dateOfBirth;
    result = result*23 + this.iqLevel;
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
            that.iqLevel == this.iqLevel;
  }}

