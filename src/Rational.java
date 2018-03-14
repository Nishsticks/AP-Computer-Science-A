package src;
/*
* @author Nishanth Mankame
* @version 3/13/2018
*/
public class Rational
{

    public int numerator;
    public int denominator;

    public Rational()
    {
        numerator = 0;
        denominator = 1;
    }
    public Rational(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }

    public void negate()
    {
        numerator = numerator *-1;
    }

    public void invert()
    {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble()
    {
        return ((double) numerator)/((double) denominator);
    }

    public void reduce()
    {
        int smallest;
        if (numerator < denominator)
        {
            smallest = numerator;
        }
        else
        {
            smallest= denominator;
        }
        for (int i = 2; i <smallest; i++)
        {
            if ((numerator%i==0) && (denominator%i == 0))
            {
                numerator/=i;
                denominator/=i;
                i = 1;
            }
        }
    }

    public void add(Rational myRation)
    {
        numerator = (numerator*myRation.denominator) + (myRation.numerator*denominator);
        denominator = denominator*myRation.denominator;
        reduce();
    }

    @Override
    public String toString()
    {
        if (denominator == 0)
        {
            return "Error: Dividing by 0";
        }
        return numerator + "/" +denominator;
    }
}
