/* Bravin Rutto
 * COSC 1337 001
 * 10/11/2021
 * Purpose: The test class for Lab7L3 that creates a Car and Airplane and prints out their information (Lab7L3)
 * Insight:The classes could easily be combined since they both include only a model, an amount of fuel/gas used,
 * and a number of miles traveled. 
 */

package automobiles;

/**The test class for Lab7L3 that creates a Car and Airplane and prints out their information */
public class Lab7L3 {

	/**The entry point for the program
	 * 
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		//create a Car and an Airplane
		Car myCar = new Car();
		Airplane myPlane = new Airplane("model",0,0.0);
		
		//print out the info for the car and the airplane that you created
		System.out.println(myCar);
		System.out.println(myPlane);
	} //end main

}
