package src.Roaches;

import java.awt.peer.SystemTrayPeer;

/**
 * Write a description of class RoachPopulation here.
 * 
 * @author Nishanth Mankame
 * @version (a version number or a date)
 */
public class RoachPopulation
{
    // instance variables - replace the example below with your own
    private double population;

    public RoachPopulation(int initialPop)
    {
        population = initialPop;

    }


    public void breed()
    {
        population = population * 2;
    }

    public void spray()
    {
        population = Math.round(population*0.9);

    }


    public void getRoaches()
    {
        System.out.println("Roaches left: " + population);

    }


}
