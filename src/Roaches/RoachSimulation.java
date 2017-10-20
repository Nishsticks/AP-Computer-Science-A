package src.Roaches;

/**
 * Write a description of class RoachSimulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class RoachSimulation
{
	public static void main( String[] args )
   {

   	RoachPopulation myRoaches = new RoachPopulation(10);

   	myRoaches.breed();
   	myRoaches.spray();
   	myRoaches.getRoaches();

   	myRoaches.breed();
   	myRoaches.spray();
   	myRoaches.getRoaches();

   	myRoaches.breed();
   	myRoaches.spray();
   	myRoaches.getRoaches();




		
   }
}