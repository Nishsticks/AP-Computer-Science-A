package src;

import java.util.Arrays;

public class ArraySort {

    public static void main(String args[])
    {

        int[] arr = new int[] {9,8,7,6,5,-4,3,2,0,-2};
        System.out.println(Arrays.toString(smallToBig(arr)));
//        System.out.println(Arrays.toString(bigToSmall(arr)));

    }


    public static int[] swap(int[] numarray, int a, int b)
    {
        int val1 = numarray[a];
        numarray[a] = numarray[b];
        numarray[b] = val1;
        return numarray;
    }
    public static int[] smallToBig(int[] arr)
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

    public static int[] bigToSmall(int[] arr)
    {
        int maxVal = 0;

        for (int i = 0; i<arr.length; i++)
        {
            for (int a = i+1; a<arr.length; a++)
            {
                if (arr[a]>arr[maxVal])
                {
                    maxVal = a;
                }
            }
            swap(arr, i, maxVal);
        }
        return arr;
    }
}
