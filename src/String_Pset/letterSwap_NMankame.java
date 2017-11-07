package src.String_Pset;
/*
* This program takes in 2 words and swaps the first two letters
*
* @author Nishanth Mankame
* Date: 11/6/17
*
* */


import java.util.Scanner;

public class letterSwap_NMankame {

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Input tow words: "); //Press Enter in between each word

        String word1 = input.next();
        String word2 = input.next();

        String swapped1 = word2.substring(0,1) + word1.substring(1);
        String  swapped2 = word1.substring(0, 1) + word2.substring(1);
        System.out.println(swapped1 + " " + swapped2);


    }




}
