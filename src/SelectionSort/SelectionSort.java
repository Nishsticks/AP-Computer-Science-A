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
    public int[] sort(int[] arr)
    {
        int minVal = 0;
        for (int i = 0; i<arr.length; i++)
        {
            for (int a = i+1; a<arr.length; a++)
            {
                if (arr[a]<arr[minVal])
                {
                    minVal = a;
                }
            }
            swap(arr, i, minVal);
        }
        return arr;

    }
    public void swap(int[] arr, int a, int b)
    {
        int placeHold = arr[a];
        arr[a] = arr[b];
        arr[b] = placeHold;
    }

}