package hw01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
        public static void sampleMethod()throws InputMismatchException {
            Random rand=new Random();
            Scanner rs = new Scanner(System.in);
            int c=0;
            int[] arr = new int[1000];

            int a=rand.nextInt(10);
            System.out.println("Let the game begin!.");
            boolean bool=false;


            while(bool==false) {
                try {
                    int b = rs.nextInt();

                    if (b > a) {
                        System.out.println("it is too big,try again!");
                    } else if (b < a) {
                        System.out.println("it is too small , try again!");
                    } else if (a == b) {
                        bool = true;

                    }


                    arr[c] = b;
                    c++;

                }
                catch (Exception e) {
                    System.out.println("I dont understand, try again");



                }
            }


            System.out.print("Your Numbers: ");

            for (int i=0;i<c;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            System.out.println("Congratulations, "+a);

        }
        public static void main(String args[]) {
            try{
                sampleMethod();
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("");
            }
        }


    }


