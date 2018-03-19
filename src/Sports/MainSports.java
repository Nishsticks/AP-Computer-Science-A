/**
 *  class MainSports is a driver for SportTeam Project.
 * 
 * @author SHANNON BRAUN
 * @version FEBRUARY 2017
 */
package src.Sports;
public class MainSports
{
    public static void main(String[] args)
    {
        SportsTeam greenBay = new Football("Packers", 16, 10, 6, 0, 51, 8);

        SportsTeam minnesota = new Baseball("Twins", 162, 59, 103, 0, 200, 690, 126);

        System.out.println(greenBay);

        System.out.print("\n\n" + minnesota);

    }
}
