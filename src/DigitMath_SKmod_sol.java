package src;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class DigitMath_SKmod_sol
{
    public static void main( String args[] )
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :: ");
        num = in.nextInt();
        in.nextLine();
        System.out.println(sumDigits(12));

        //add test cases

    }

    private static int countDigits( int number )
    {
        int sum=0;
        while (number >= 1){

            number = number/10;
            sum++;

        }
        return sum;
    }

    private static int sumDigits( int number )
    {
        int sum=0;
        while (number >=1){

            sum = (number%10) + sum;
            number = number/10;


        }



        return sum;
    }

    public static double averageDigits( int number )
    {



        //return (double) ( );    //fill out this line
        return 0.0;				   // delete this line - it's just so so it will compile
    }
}