/* Bravin Rutto
 * COSC 1337 001
 * 10//2021
 * Purpose: To encapsulate information about an Airplane, 
 * including a model, the number of miles flown, and the amount of fuel used (Lab7L2).
 * Insight: Yes! Because the Airplane uses th the toString() method, and the toString includes all the data items!
 */

package automobile;

public class Airplane {
	// fields for Airplane
	private String model;
	private int milesFlown;
	private double gallonsOfFuel;

	// constructor for Airplane
	public Airplane(String model, int milesFlown, double gallonsOfFuel) {
		setModel(model);
		setMilesFlown(milesFlown);
		setGallonsOfFuel(gallonsOfFuel);
	}

	// Getters and setters for Airplane
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMilesFlown() {
		return milesFlown;
	}

	public void setMilesFlown(int milesFlown) {
		this.milesFlown = milesFlown;
	}

	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}

	public void setGallonsOfFuel(double gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}

	public double getMilesPerGallon() {
		if (getGallonsOfFuel() > 0.001)
			return getMilesFlown() / getGallonsOfFuel();
		return 0.0;
	}

	@Override
	public String toString() {
		return "Airplane: " + getModel() + "\n\tMiles Flown: " + getMilesFlown() + ". Fuel Used: " + getGallonsOfFuel()
				+ " gallons.\n\tFuel Efficiency: " + getMilesPerGallon() + " mpg.";
	}

	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}

}
