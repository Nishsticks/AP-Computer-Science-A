package src;

public class Decimal2Binary {

    static String output= "";
    public static void main(String[] args){

       int number =  convert(12);
//       System.out.println(output);


    }

    public static int convert(int num){

        if (num>=1){
            if (num%2 ==0){
                output = "0" + output;
                return convert(num/2);

            }
            else{

                output = "1" + output;
                return convert(num/2);
            }

        }
        else{

            System.out.print(output);
            return 0;
        }


    }


}
