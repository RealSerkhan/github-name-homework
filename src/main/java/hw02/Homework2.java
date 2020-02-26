package hw02;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Homework2 {
    static Random ran = new Random();
    static int a = ran.nextInt(5);
    static int b = ran.nextInt(5);


    static String[][] arr = new String[5][5];
    public static void main(String[] args) {
        Scanner rs=new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");

        int x = rs.nextInt();
        int y = rs.nextInt();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]="-";}}

        while (a != x || b != y) {

            arr[x-1][y-1] = "*";
            For_loop();
            System.out.println("Again!");
            x = rs.nextInt();
            y = rs.nextInt();
        }
        arr[x-1][y-1]="x";
        System.out.println("you have won the game!");

        For_loop();
    }
    public static void For_loop() {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.print("|"+arr[i][j]);

            }
            System.out.println("|");
        }

    }
}

