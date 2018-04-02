package src.Shape_Project;

/**
 * Main method to exercise the Shape Interface.
 * AP Computer Science
 *
 * @author GKB
 * @version February 2017
 */
public class MainInterface
{
    public static void main()
    {
        Shape[] test = new Shape[10];

        // comment out Shape instantiations not yet implemented
        test[0] = new Triangle(3,4,5);
        test[1] = new Circle(1);
        test[2] = new Square(1);
        test[3] = new Rectangle(3,4);
        test[4] = new Triangle(5,12,13);
        test[5] = new Square(10);
        test[6] = new Rectangle(20,2);
        //test[7] = new Square(5);
        test[8] = new Circle(5);
        test[9] = new Triangle(9,12,15);

        for ( Shape tt : test)
            if ( tt != null)
            {
                System.out.println( tt );
                System.out.println("\tarea is: " + tt.area());
                System.out.println("\tdiagonal is: " + tt.diagonal());
                System.out.println("\tlongest edge is: " + tt.longestEdge());
                System.out.println("\tperimeter is: " + tt.perimeter());
            }
    }
}

