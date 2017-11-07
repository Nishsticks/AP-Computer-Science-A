package src.String_Pset;
/*
* This program formats your phone number with "-"
*
* @author Nishanth Mankame
* Date: 11/6/17
*
* */


import java.util.Scanner;

public class phoneNumber_NMankame {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phone number: ");
        String number = input.next();


        String first3 = number.substring(0, 3);
        String second3 = number.substring(3, 6);
        String last4 = number.substring(6);

        System.out.println("("+first3 +")" +" " + second3 + "-" + last4);


    }

}
