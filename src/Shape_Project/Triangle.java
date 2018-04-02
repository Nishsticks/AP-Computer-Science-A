package src.Shape_Project;

public class Triangle implements Shape{

    public double s1;
    public double s2;
    public double s3;

    public Triangle(double side1, double side2, double side3)
    {
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }

    @Override
    public double area() {
        double avg = (s1 + s2 + s3)/2;
        return Math.sqrt(avg * (avg - s1)* (avg - s2) * (avg - s3));
    }

    @Override
    public double diagonal() {
        return -1;
    }

    @Override
    public double perimeter() {
        return s1 +s2 + s3;
    }

    @Override
    public double longestEdge() {
        double biggest;

        return 0;
    }
}
