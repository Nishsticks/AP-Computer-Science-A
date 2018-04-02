package src.Shape_Project;

/**
 * AP Computer Science
 * This is a sample Interface in Java.
 * To implement this interface you must implement
 * every method.
 *
 * @author Braun/Behnke
 * @version 2018
 */
public interface Shape
{
    /**
     * Returns the area of the shape.
     * @return  The area of the shape
     */
    double area();

    /**
     * Returns the perimeter of the shape.
     * @return The perimeter of the shape.
     */
    double perimeter();

    /**
     * Returns the longest edge of the shape.
     * @return The longest edge of the shape.
     */
    double longestEdge();

    /**
     * Returns the diagonal of the shape.
     * If no diagonal, -1 is returned.
     *
     * @return The diagonal of the shape.
     * If no diagonal, -1 is returned.
     */
    double diagonal();
}
