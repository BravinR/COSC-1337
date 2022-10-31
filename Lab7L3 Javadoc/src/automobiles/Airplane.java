/* Bravin Rutto
 * COSC 1337 001
 * 10/11/2021
 * Purpose: To encapsulate information about an Airplane, 
 * including the model, the number of miles flown, and the amount of fuel used (Lab7L3).
 */

package automobiles;

/**A class that encapsulates an Airplane. */
public class Airplane {
	
	/**The model of the Airplane */
	private String model;

	/**The miles flown by this Airplane */
	private int milesFlown;

	/**The amount of fuel this Airplane has used */
	private double gallonsOfFuel;
	
	/**Creates a new Airplane with the input information
	 * 
	 * @param model the model of the Airplane
	 * @param milesFlown the miles flown by the Airplane
	 * @param gallonsOfFuel the gallons of fuel used by the Airplane so far
	 */
	public Airplane(String model, int milesFlown, double gallonsOfFuel) {
		setModel(model);
		setMilesFlown(milesFlown);
		setGallonsOfFuel(gallonsOfFuel);
	}

	/**Returns the model of the Airplane
	 * 
	 * @return the model of the Aiplane
	 */
	public String getModel() {
		return model;
	}

	/**Sets the model of the Airplane
	 * 
	 * @param model the new model of the Airplane
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**Returns the miles flown by the Airplane
	 * 
	 * @return the miles flown by the Airplane
	 */
	public int getMilesFlown() {
		return milesFlown;
	}

	/**Sets the miles flown by the Aiplane
	 * 
	 * @param milesFlown the new miles flown by the Airplane
	 */
	public void setMilesFlown(int milesFlown) {
		this.milesFlown = milesFlown;
	}

	/**Returns the gallons of fuel used so far by the Airplane
	 * 
	 * @return the gallons of fuel used so far by the Airplane
	 */
	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}

	/**Sets the gallons of fuel used so far by the Airplane
	 * 
	 * @param gallonsOfFuel gallons of fuel used so far by the Airplane
	 */
	public void setGallonsOfFuel(double gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}
	
	//data manipulation method for airplane

	/**Returns the fuel efficiency of this Aiplane. Note that if gallonsOfFuel <= .001, this method just returns 0,
	 * 
	 * @return the fuel efficiency of this Airplane as miles per gallon (mpg).
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfFuel() > .001)
			return getMilesFlown() / getGallonsOfFuel();
		else
			return 0.0;
	}
	
	/**Returns a String version of this Airplane
	 * 
	 * @return a String version of this Airplane
	 */
	@Override
	public String toString() {
		return "Airplane: "+getModel()+"\n\tMiles Flown: "+getMilesFlown()+". Fuel Used: "+getGallonsOfFuel()+
				" gallons.\n\tFuel efficiency: "+getMilesPerGallon()+ " mpg.";
	}

	/**Returns true if the two Airplanes in question have the same data
	 * 
	 * @param o The Object to which the Airplane will be compared
	 * @return true if the two Airplanes have the same data.
	 */
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}
}
