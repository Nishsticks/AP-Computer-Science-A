

/**
 * Class SearchSortRunner calls various searching and sorting methods on data sets.
 *
 * @author (DK)
 * @version (April 2018)
 */
package src.SearchLab_rBinSrch
public class SearchSortRunner
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        //Create a new DataSet object of size 10, 100, or 1000 
        
        // The following code doesn't work. First, fix my mistakes.
        int size = 10;        
        DataSet nums = new DataSet[size];
        
        for (int k = 0; k < nums; k++) 
            nums[k] = 10 * i;

        //run each type of search on some target value and print the findings.
        System.out.println( "rec_bs on target 40 returns " + nums.binarySearch(40));
        System.out.println( "rec_bs on target -10 returns " + nums.binarySearch(-10));
    }
}
