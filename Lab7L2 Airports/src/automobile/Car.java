/* Bravin Rutto
 * COSC 1337 001
 * 10/1/2021
 * Purpose: To encapsulate information about a car, 
 * including the model, the number of miles driven, and the amount of gas used (Lab7L2).
 */
package automobile;

import java.text.DecimalFormat;

public class Car {

	// private fields for car
	private String model;
	private int milesDriven;
	private double gallonsOfGas;
	private DecimalFormat decFormat = new DecimalFormat("0.0");

	// constructors for the car
	public Car() {
		setModel("unknown");

	}

	public Car(String model, int milesDriven, double gallonsOfGas) {
		setModel(model);
		setMilesDriven(milesDriven);
		setGallonsOfGas(gallonsOfGas);
	}

	// getters and setters for Car
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMilesDriven() {
		return milesDriven;
	}

	public void setMilesDriven(int milesDriven) {
		if (milesDriven >= 0)
			this.milesDriven = milesDriven;
		else
			this.milesDriven = 0;
	}

	public double getGallonsOfGas() {
		return gallonsOfGas;
	}

	public void setGallonsOfGas(double gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}

	// data manipulation methods
	public double getMilesPerGallon() {
		if (getGallonsOfGas() > 0.001)
			return getMilesDriven() / getGallonsOfGas();
		return 0;
	}

	public double getMoneySpentOnGas(double pricePerGallon) {
		return pricePerGallon * getGallonsOfGas();
	}
	
	//Overridden methods
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Car))
			return false;
		Car otherCar = (Car) o;
		return otherCar.getModel().equals(getModel()) && 
				otherCar.getMilesDriven() == getMilesDriven() && 
				otherCar.getGallonsOfGas() == getGallonsOfGas();
	}
	@Override
	public String toString() {
		return "Car: "+ getModel()+"\n\tMiles Driven: "+getMilesDriven()+". Gas used: "+getGallonsOfGas()+
				" Fuel Efficiency: "+decFormat.format(getMilesPerGallon())+ " mpg.";
	}
}

