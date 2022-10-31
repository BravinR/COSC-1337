/* Bravin Rutto
 * COSC 1337 001
 * 10/11/2021
 * Purpose: To encapsulate information about a Car, 
 * including the model, the number of miles driven, and the amount of gas used (Lab7L3).
 */

package automobiles;

import java.text.DecimalFormat;

/**A class that encapsulates inforamtion about a Car including the model, the miles driven, and the amount of fuel used */

public class Car {
	
	/**The model of the Car */
	private String model;

	/**The miles driven in the Car */
	private int milesDriven;

	/**The amount of gas used by the Car */
	private double gallonsOfGas;

	/**The format for printing out decimals (0.0) */
	private DecimalFormat decFormat = new DecimalFormat("0.0");
	
	/** Creates a new Car kwith model as "unknown" */
	public Car() {
		setModel("unknown");
	}
	
	/**Create a new Car with input model, input milesDriven, and input gallonsOfGas
	 * 
	 * @param model the new model of the Car
	 * @param milesDriven the new miles driven for the Car
	 * @param gallonsOfGas the new gallons of gas for the Car
	 */
	public Car(String model, int milesDriven, double gallonsOfGas) {
		setModel(model);
		setMilesDriven(milesDriven);
		setGallonsOfGas(gallonsOfGas);
	}
	
	/**Returns the model of the Car
	 * 
	 * @return the model of the Car
	 */
	public String getModel() {
		return model;
	}
	
	/**Set the model of the Car
	 * 
	 * @param model the model of the Car
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**Returns the miles driven in the Car
	 * 
	 * @return the miles driven in the Car
	 */
	public int getMilesDriven() {
		return milesDriven;
	}
	
	/**Sets the number of miles driven IF the input is greater than 0. Otherwise sets it to 0
	 * 
	 * @param milesDriven the new number of miles driven
	 */
	public void setMilesDriven(int milesDriven) {
		if (milesDriven > 0)
			this.milesDriven = milesDriven;
		else
			this.milesDriven = 0;
	}
	
	/**Returns the gallons of gas for the Car
	 * 
	 * @return the gallons of gas for the Car
	 */
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	

	/**Sets the amount of gas that has been used by the Car IF the input is greater than 0. Sets it to 0 otherwise.
	 * 
	 * @param gallonsOfGas the new amount of gas that has been used by the Car.
	 */
	public void setGallonsOfGas(double gallonsOfGas) {
		if (gallonsOfGas > 0)
			this.gallonsOfGas = gallonsOfGas;
		else
			this.gallonsOfGas = 0;
	}
	
	/**Returns the fuel efficiency of the Car IF the amount of gas used is greater than .001. Otherwise, returns 0.
	 * 
	 * @return the fuel efficiency of the Car
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfGas() > .001)
			return getMilesDriven()/getGallonsOfGas();
		return 0.0;
	}
	
	/**Returns the amount of money spent on gas for the Car so far
	 * 
	 * @param pricePerGallon the price per gallon of gas
	 * @return the amount of money spent on gas so far
	 */
	public double getMoneySpentOnGas(double pricePerGallon) {
		return pricePerGallon*getGallonsOfGas();
	}
	
	/**Returns true if and only if thr input Car has the same data as this Car
	 * 
	 * @param o the object to compare this Car to
	 * @return true if the input Car has the same data as this Car
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car))
			return false;
		Car otherCar = (Car) o ;
		return otherCar.getModel().equals(getModel()) && otherCar.getMilesDriven() == getMilesDriven() &&
				otherCar.getGallonsOfGas() == getGallonsOfGas();
	}


	/**Returns a String version of this Car
	 * 
	 * @return the String version of this Car
	 */
	@Override
	public String toString() {
		return "Car:"+getModel()+"\n\tMiles Driven:"+getMilesDriven()+". Gas Used: "+getGallonsOfGas()+
				" Fuel Efficiency: "+decFormat.format(getMilesPerGallon())+" mpg.";
	}
}
