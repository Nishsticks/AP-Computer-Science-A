//modified from (c) A+ Computer Science
//
//YOUR Name -
package src;


import java.util.Scanner;

public class ReverseNumberRunner
{
    public static void main( String args[] )
    {
        //add SCANNER to get test cases
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        System.out.println(getReverse(input.nextInt()));

    }

    public static int getReverse(int num)
    {
        int numDig = num;
        int sum=0;
        int output = 0;
        while (numDig >= 1){
            numDig = numDig/10;
            sum++;
        }

        while (num >10){
            output = output + (int) ((num - ((num/10)*10))*Math.pow(10, sum-1));
            num = num/10;
            sum--;
        }
        output = output + num;

        return output;
    }

}