package src.SearchLab;

/**
 * Class DataSet supports 1-D arrays and various search and sort method.
 *
 * @author (DK)
 * @version (April 2018)
 */
public class DataSet
{
    // instance variables - replace the example below with your own
    private int data[];

    /**
     * Constructor for objects of class DataSet
     */
    public DataSet()
    {
        // initialise instance variables
        data = new int[0];
    }

    /**
     * Constructor for objects of class DataSet
     */
    public DataSet(int size)
    {
        // initialise instance variables
        data = new int[size];
    }

    /**
     * Populates the array (creates and ordered array)
     */
    public void populate()
    {
        for (int i = 0; i < data.length; i++) 
            data[i] = 10 * i;
    }
    /**
     *  Sequential search returns pos such that data[pos] == target,
     *  or -1 if target is not among data[0], ..., data[n-1].
     *  Preconditon: data is not null 
     * 
     */
    public int sequentialSearch(int target)
    {
        // put your code here
        int left = 0;
        int right = data.length;
        int index = 0;






        return -1;
    }

    /**
     *  Binary search returns pos such that data[pos] == target,
     *  or -1 if target is not among data[0], ..., data[n-1].
     *  Preconditon: data contains n values sorted in ascending order. 
     */
//    public int binarySearch(int target)
//    {
//        // put your code here
//        int left, right, mid;
//
//        while (left <= right) {
//     }
//        return -1;
//    }
//}
