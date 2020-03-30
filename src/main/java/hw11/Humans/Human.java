package hw11.Humans;

import hw11.DAO.Family;
import hw11.DayOfWeek;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;


public  class Human {
  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  private String name;
  private String surname;
  private long dateOfBirth;
  public String dateOfBirth1;
  private int iqLevel;
  private Map<DayOfWeek, ArrayList<String>> schedule;
  private Family family;


  public Human() {
  }

  public Human(String name, String surname, long dateOfBirth) throws ParseException {
    this.setName(name);
    this.setSurname(surname);
    this.dateOfBirth=dateOfBirth;
  }

  public Human(String name, String surname, long dateOfBirth, int iqLevel) {
    this.name = name;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    this.iqLevel = iqLevel;
  }

  public Human(String name, String surname, String dateOfBirth, int iqLevel, Map<DayOfWeek, ArrayList<String>> schedule) throws ParseException {
    this.name = name;
    this.surname = surname;
    dateOfBirth1=dateOfBirth;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.parse(dateOfBirth, formatter);
    this.dateOfBirth=localDate.toEpochDay()*(60*60*24*1000);
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
  public long getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(long dateOfBirth) {
    this.dateOfBirth=dateOfBirth;
  }
  public int getAge(){
    return (int) (LocalDateTime.now().getYear() - this.dateOfBirth);
  }
  public Map<DayOfWeek, ArrayList<String>> getSchedule() {
    return schedule;
  }
  public void setSchedule(Map<DayOfWeek, ArrayList<String>> schedule) {
    this.schedule = schedule;
  }


  public void deleteFromFamily(){
    this.family = null;
  }
  public String describeAge(){

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate birth = LocalDate.parse(dateOfBirth1, formatter);

    LocalDate now = LocalDate.now();

    Period ferq = Period.between(birth, now);

    return String.format("%s is %s days %s months %s years old",getName(),ferq.getDays(),ferq.getMonths(),ferq.getYears());

  }private String formatter() {
    Instant instant = Instant.ofEpochMilli(this.dateOfBirth);
    LocalDateTime new1 = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    return String.format("%s/%s/%s", new1.getDayOfMonth(), new1.getMonthValue(), new1.getYear());
  }



  @Override
  public String toString() {
    return String.format("Human{name='%s', surname='%s', year=%s, iq=%d, schedule= %s",
            this.getName(), this.getSurname(),this.formatter(), this.getIqLevel(), schedule);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Human)) return false;
    Human human = (Human) o;
    return dateOfBirth == human.dateOfBirth &&
            iqLevel == human.iqLevel &&
            Objects.equals(formatter, human.formatter) &&
            Objects.equals(name, human.name) &&
            Objects.equals(surname, human.surname) &&
            Objects.equals(schedule, human.schedule) &&
            Objects.equals(family, human.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatter, name, surname, dateOfBirth, iqLevel, schedule, family);
  }
}

