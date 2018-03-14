package src;
/*
 * @author Nishanth Mankame
 * @version 3/13/2018
 */
public class RationalTester
{
    public static void main(String[] args)
    {
        Rational myRation = new Rational(1, 3);

        myRation.invert();
        System.out.println(myRation);
        myRation.invert();

        myRation.negate();
        System.out.println(myRation);
        myRation.negate();

        myRation.reduce();
        System.out.println(myRation);

        System.out.println(myRation.toDouble());

        myRation.add(new Rational(1, 2));
        System.out.println(myRation);
    }
}
