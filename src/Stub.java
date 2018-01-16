/*
 * Java shell
 */
package src;

import java.util.Arrays;

public class Stub		  // a general purpose stub.
{
    public static void main(String args[])
    {

        // Define and initialize your variables here.
        for (int i = 1; i <=3; i++)
        {
            if (i==1)
            {
                int[] array1 = {0,1,2,3,4,5,6,7,8,9};
                System.out.println(Arrays.toString(array1));
            }

            if (i==2)
            {
                int[] array2 = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9};
                System.out.println(Arrays.toString(array2));

            }
            if(i==3)
            {
                int[] array3 = {0,1,0,1,0,1,0,1,0,1};
                System.out.println(Arrays.toString(array3));
            }
            if(i==3)
            {
                int[] array4 ={0,2,4,6,8,10,12,14,16,18};
                System.out.println(Arrays.toString(array4));
            }
            if (i==5)
            {
                int[] array5={0,1,4,99,16,25,36,49,64,81};
                System.out.println(Arrays.toString(array5));
            }
        }


        //Write your print statements below this line
    }
}