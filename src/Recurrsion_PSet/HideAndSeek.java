package src.Recurrsion_PSet;
import java.util.Scanner;
public class HideAndSeek {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many seconds: ");
        countDown(input.nextInt());

    }

    public static void countDown(int start) {
        if (start >=1) {

            System.out.println(start);
            start--;
            countDown(start);
        }
        else{

            System.out.println("Ready or not, Here I come!");


        }

    }



}
