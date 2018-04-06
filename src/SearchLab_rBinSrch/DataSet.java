
/**
 * Class DataSet supports 1-D arrays and recursive binary search.
 *
 * @author (DK)
 * @version (April 2018)
 */
package src.SearchLab_rBinSrch;
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
     *  Binary search returns pos such that data[pos] == target,
     *  or -1 if target is not among data[0], ..., data[n-1].
     *  Preconditon: data contains n values sorted in ascending order. 
     *
     *  Note that binarySearch will have only one line, a return statement. All the work
     *  is done by the recursive implementation below.
     */
    public int binarySearch(int target)
    {
        if




        return _____________;
     }

    /**
     *   This helper method actually performs the recursive binary search. 
     *   By making it private we don't need to change the interface for the client class. 
     */
    private int r_binarySearch(int left, int right, int target)
    {
        // put your code here
        return _______________;
     }
}
