package src.BookList;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;


public class BookListRunner
{
   public static void main( String args[] )
   {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How many books will you catalog: ");
        int numBooks = keyboard.nextInt();
        
        //Create an array of type Book. Use the number of books to determine the length.
        Book[] mybooks = new Book[numBooks];
        
        String title = "";
        String media = "";
        for(int i=0; i<numBooks;i++)
        {   
            System.out.print("Enter book title : ");
            title = keyboard.next();
        
            System.out.print("Type of media for " + title + " : ");
            media=keyboard.next();    
            
            //instantiate the book and add it to the list of books            
            mybooks[i]= new Book(title, media);
        }       
        //Generate simple output by calling Arrays.toString
        System.out.println(Arrays.toString(mybooks));
            
    }       
}