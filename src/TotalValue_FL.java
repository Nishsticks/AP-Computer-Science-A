package src;
/*NOTE: Comment the above line out before compiling on another computer. This above line was used to compile in
InteliJ java IDE.

This program takes in the number of quarters, pennies, nickels and dimes and outputs the value in dollars.

 */


import java.util.Scanner;

public class TotalValue_FL {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int value;
        int dollars;
        int cents;

        System.out.println("Pennies: ");
        pennies = input.nextInt();

        System.out.println("Nickels: ");
        nickels = input.nextInt();

        System.out.println("Dimes: ");
        dimes = input.nextInt();

        System.out.println("Quarters: ");
        quarters = input.nextInt();

        value = (quarters*25) + (dimes*10) + (nickels*5) + pennies;

        dollars = value/100;

        cents = value%100;

        System.out.println("-------------------------");
        System.out.println("Total Value: $" + dollars + "." + cents);















    }





}
