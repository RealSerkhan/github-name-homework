package hw03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void sampleMethod()throws InputMismatchException {
        Scanner rs=new Scanner(System.in);


        String[][] arr=new String[7][2];
        String[] days={"sunday","monday","tuesday","wednesday","thusday","friday","saturday"};
        String[] events={"Rest","Teaching Quran","Going to Elmler","Hosting","Going to Barla","Going to Mosque","Thinking about what to do"};


        for (int a=0;a<7;a++){
            arr[a][0]=days[a];
            arr[a][1]=events[a];
        }
        boolean f=true;
        while (f){
            try{
                System.out.println("Please, input the day of the week: ");

                String gun=null;
                gun=rs.nextLine();
                String a=gun.toLowerCase().trim();

                int b=0;


                if (a.equals("exit")){
                    System.out.println("See You");
                    break;
                }

                boolean c=false;
                while(c==false){
                    c=a.equals(arr[b][0]);
                    b++;
                }

                System.out.println("Your tasks for "+a+":"+arr[b-1][1]);}
            catch (Exception e){
                System.out.println("Sorry, I don't understand you, please try again.");


            }}


    }
    public static void main(String args[]) {
        try{
            sampleMethod();
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("");
        }
    }
}

