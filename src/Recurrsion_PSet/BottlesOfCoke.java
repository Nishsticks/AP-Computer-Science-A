package src.Recurrsion_PSet;

public class BottlesOfCoke {

    public static void main(String[] args)
    {

        singCoke(99);



    }

    public static void singCoke(int start) {
        if (start >=1) {

            System.out.println(start + " bottles of Coke on the wall, " + start + " cans of Coke, take one down, pass it around, " + start + " bottles Coke on the wall.");
            start--;
            singCoke(start);
        }

    }


}
