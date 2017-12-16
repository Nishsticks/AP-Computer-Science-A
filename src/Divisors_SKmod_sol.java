//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Divisors_SKmod_sol
{
    public static void main( String args[] )
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :: ");
        num = in.nextInt();
        in.nextLine();

        System.out.println(num + " has divisors: " + findDivisors(num));
    }
//hahaa
    public static String findDivisors( int number )
    {
        int divisor = 1;
        String output = "";
        while (number/divisor > 1){

            if (number%divisor == 0){
                output = output + " " + divisor;
            }
            divisor++;
        }
        return output;
    }
}