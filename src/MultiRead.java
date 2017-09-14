//(c) A+ Computer Science  -  www.apluscompsci.com

//scanner int example

import java.util.Scanner;

public class MultiRead
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter 5 ints with spaces in between :: ");
        int a;
        int b;



        System.out.println(keyboard.nextInt());
        System.out.println(keyboard.nextInt());
        System.out.println(keyboard.nextInt());


        //add code to read in all 5 ints
        a = keyboard.nextInt();
        b = keyboard.nextInt();

        System.out.println(a + "\n" + b);

    }
}
