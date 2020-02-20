package hw04;

public class Pet {
     public String species;
     public String nickname;
    public int age;

    public int tricklevel;

    public String habits;
    public void eat(){
        System.out.println(" i am eating!");}

        public Pet(){

        }
        public Pet(String species,int age){
        this.species=species;
        this.age=age;

        }
    public Pet(String species,String nickname,int age,int tricklevel,String habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;

    }

    public void respond(){
        System.out.println("Hello owner. i am "+nickname+". i miss you");

    }
    public void foul(){
        System.out.println("i need to cover it up!");

    }

    @Override
    public String toString() {
        return "Pet="+species +"{" +

                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits='" + habits + '\'' +
                '}';
    }
}
