package src.String_Pset;
/*
* This program prints the multiple combinations of your name
*
* @author Nishanth Mankame
* Date: 11/6/17
*
* */

import java.util.Scanner;

public class LastName_NMankame {


    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: "); // Press enter between each part of your name
        String first = input.next();
        String middle = input.next();
        String last = input.next();

        System.out.println(first+ " " + middle + " " + last);
        System.out.println(first+ " " + last + " " + middle);
        System.out.println(middle+ " " + first + " " + last);
        System.out.println(middle+ " " + last + " " + first);
        System.out.println(last+ " " + first + " " + middle);
        System.out.println(last+ " " + middle + " " + first);


    }


}
