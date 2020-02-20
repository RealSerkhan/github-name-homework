package hw04;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("cat",1);
        Pet max=new Pet();
        Human Dad=new Human("Fazil","Serkhanbeyov",1971);
        Human Mom=new Human();
        Human Hilal=new Human("Hilal","Serkhanbeyov",1997,Mom,Dad);
        String[] b={"Ders oxumaq","Oyun oynamaq"};

        Human Real=new Human("Real","Serkhanbeyli",2000,80,max,Mom,Dad,b);
        String a="Running";
        Pet brotherdog=new Pet("Dog","Phin",3,90,a);
        Mom.name="mom";
        Mom.surname="Serkhanbeyov";
        Mom.pet=new Pet();
        Mom.father=new Human();
        Mom.mother=new Human();
        Mom.year=1971;
        Mom.IQ_level=200;
        Dad.IQ_level=200;
        Dad.mother=new Human();
        Dad.father=new Human();
        Dad.pet=new Pet();
        Hilal.pet=max;
        Hilal.IQ_level=200;
        max.species="dog";
        max.nickname="Max";
        max.age=2;
        max.tricklevel=75;
        max.habits=" {just sleeps}";


//        pet.eat();
//        pet.respond();
//        pet.foul();
        System.out.println(Real.toString());
        Real.greetPet();
        System.out.println(brotherdog.toString());
                brotherdog.eat();
        brotherdog.respond();
        brotherdog.foul();
    }
}
