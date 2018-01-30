package src.SelectionSort;/*
 * This class will find the min and max of an array
 */

import java.util.Arrays;               //have this handy for temp debug printing

public class SelectionSort
{
    /*
     * sort will sort by the method implied in the class name of this program.
     */

    
     /*
     * swaps the indicated rows.
     */
    
    
    /*
     * minLoc will return the index of the minimum value of the array, starting from a given index.
     */
    public int[] sort(int[] numArray)
    {
        int placeHold = 0;
        int minIndex = 0;
        for(int c = 0; c<numArray.length; c++)
        {
            for (int a = c+1; a<numArray.length; a++)
            {
                if (numArray[a] < numArray[c]){}

            }



//            for (int i = c; i < numArray.length; i++)
//            {
//
//                for (int a = i+1; a < numArray.length; a++)
//                {
//                    if (numArray[i] < numArray[a])
//                    {
//                        minIndex = i;
//
//                    }
//                }
//            }
//            swap(numArray, c, minIndex);

        }
        return numArray;
    }
    public void swap(int[] arr, int a, int b)
    {
        int placeHold = arr[a];
        arr[a] = arr[b];
        arr[b] = placeHold;
    }

}