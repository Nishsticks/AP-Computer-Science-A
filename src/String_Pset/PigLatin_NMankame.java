package src.String_Pset;
/*
* This program converts a word to Pig Latin. It moves the last two letters of the inputted word
* to the beginning and adds "ay" to the end
*
* @author Nishanth Mankame
* Date: 11/3/17
*
* */

import  java.util.Scanner;

public class PigLatin_NMankame {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String myWord = input.next();


        String lastTwo = myWord.substring(myWord.length() - 2);

        String remaining = myWord.substring(0, (myWord.length() - 2));

        System.out.println("The pig latin word is: " + lastTwo + remaining + "ay");



    }



}
