package src.Recurrsion_PSet;


import java.util.Scanner;


public class TrianglePrint {
    static int count = 1;
    static String stars1 = "*";
    static String stars2 = "";

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter trinagle size: ");
        firstHalf(input.nextInt());



    }

    public static void firstHalf(int num){
        if (count <= num){
            System.out.println(stars1);
            stars1 = stars1 + "*";
            count++;
            firstHalf(num);
        }
        else {
            count = 0;
            stars2 = stars1;
        }


    }


    public static void secondHalf(int num){






    }



}
