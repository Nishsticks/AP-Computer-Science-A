package src.String_Pset;

/*
* This program prints the first and last letters of a word in uppercase letters
*
* @author Nishanth Mankame
* Date: 11/8/17
*
* */


import  java.util.Scanner;

public class Uppercase_NMankame {


    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Word: ");
        String myString = input.next();

        String firstLetter = myString.substring(0,1);
        String lastLetter = myString.substring((myString.length() - 1 ), myString.length());

        System.out.println("First letter: " + firstLetter.toUpperCase());

        System.out.println("Last letter: " + lastLetter.toUpperCase());


    }



}
