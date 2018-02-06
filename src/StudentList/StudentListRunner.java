package src.StudentList;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;


public class StudentListRunner
{
   public static void main( String args[] )
   {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How many students on the roster: ");
        int numStu = keyboard.nextInt();
        //declare and create an array of Student objects
       Student[] myStudents = new Student[numStu];
        
        //declare an initialize two variables as indicated by the for loop below
        
        
        for(int i = 0; i<myStudents.length; i++)
        {
            //read in student's info 
    
            //ask for name    
            System.out.print("Student's last name : ");
            String nam = keyboard.next();
        
            //ask for gpa
            System.out.print(nam + "'s gpa: ");
            double g=keyboard.nextDouble();
            
            //instantiate the Student object and add it to the roster
            myStudents[i] = new Student(nam, g);
        }       
        
        // Use the toString method of the Arrays class to print out the info collected.
        System.out.println(Arrays.toString(myStudents));
            
    }       
}