package hw10.Humans;

public enum MasculineName {
  Osman,Muhammed,Omer,Anar,Reshid;
  public static MasculineName randomName(){
    return MasculineName.values()[(int)(Math.random()*(4+1))];
  }
}
