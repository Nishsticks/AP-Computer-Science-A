package src.Recurrsion_PSet;

import java.util.Scanner;

public class CountByTwo {
static int start;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to count to: ");
        countUp(input.nextInt());

    }

    public static void countUp(int finish) {



        if (start <= finish) {

            System.out.println(start);
            start = start + 2;
            countUp(finish);
        }

    }



}
