package hw11.Humans;

public enum FeminineName {
  Firuze,Meryem,Zeyneb,Leyla,Xanim;
  public static FeminineName randomName(){
    return FeminineName.values()[(int)(Math.random()*(4+1))];
  }
}
