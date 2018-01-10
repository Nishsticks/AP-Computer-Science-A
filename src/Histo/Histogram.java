package src.Histo;//(c) A+ Computer Science
// This class has methods to build a histogram, stored as an array, from a string of data.
//Name -

import java.util.Scanner;

public class Histogram
{
    private int[] numArr;
    //Declare an int[] array instance variable. Recall fields are private.
     
    
    
    /* constructor - will create an object of this class. The int array field should
     * have 10 spots. Notice the single formal parameter of type String.
     * Hint: If you have a method that can help here, use it!
     */
    
    public Histogram(String data) {
        numArr = new int[10];
        setHisto(data);
        
       }

    /* setHisto does the work - does the binning. This is a setter. setHisto accepts a
     * single formal parameter of type String that contains the data to be analyzed.
     * At the conclusion of this method, the field is populated. 
     */

    public void setHisto(String data) {
        
       /*  If our object has been used before, the field will contain non-zero values.
        *  Loop over the instance variable, zeroing out all elements.
        */

       
        /*
         * You do not need to use Scanner to read from a String; I've done that for you. Read and understand the code,
         * and then complete the code.
         */

        Scanner chopper = new Scanner (data);
        while (chopper.hasNextInt())
        {
            int num = chopper.nextInt();
            numArr[num]++;
                                        // missing code - complete this line to build the histogram
        
       }




    }
    /* toString method - this method will print the object, i.e., the histogram. See the suggested output on
     *  the assignment sheet.
     */
    
    public String toString() {
        String output = "";

        for (int i = 0; i <numArr.length; i++)
        {
            output = output + i  + " - " + numArr[i] + "\n";
        }
        return output;
    }
}