/*Bravin Rutto
 * COSC 1337 001
 * 11/26/2021
 * Purpose: To encapsulate information about a train (Program 5 Trains)
 */
package trainsDemo;

import java.util.ArrayList;

/**A class that encapsulates information about the train
 * 
 * @author Bravin
 *
 */
public class Train {

	/** Initializes the name of the train
	 * 
	 */
	private String name;

	/**initializes array to store passengers
	 */
	private ArrayList<Passenger> passengers;
	
	/** Creates a new train
	 * @param name the name of the train
	*/
	public Train(String name){
		setName(name);
		
	}

	/**Returns the name of the train
	 * 
	 * @return name of the train
	 */
		public String getName() {
			return this.name;
		}

		/** Sets name of the train and adds it to the the passengers array
		 * 
		 * @param name the name of the train
		 */
		public void setName(String name) {
			this.name = name;
			this.passengers = new ArrayList<Passenger>();
		}

		/**Returns the number of passengers on the train
		 * @return the size of the passenger array
		 */
		public int addPassenger(Passenger passenger) {
			this.passengers.add(passenger);
			return passengers.size();
		}

		/**Returns the percent of passengers in the first class
		 * 
		 * @return the percent of passengers in the train in first class
		 */
		public double getPercentInFirstClass() {
			int numFirstClass=0;
			for (int i=0;i<passengers.size();i++) {
				if(passengers.get(i).isFirstClass()) {
					numFirstClass++;
				}
			}
			return (double) numFirstClass/passengers.size();
		}

		/** Returns the total revenue of the train
		 * 
		 * @return the total revenue of the train 
		 */
		public double getTrainRevenue(double priceForFirstClass, double regularPrice) {
			double totalRevenue=0;
			for (int i=0;i<passengers.size();i++) {
				if(passengers.get(i).isFirstClass()) {
					totalRevenue+=priceForFirstClass;
				}
				else {
					totalRevenue+=regularPrice;
				}
			}
			return totalRevenue;
		}

		/** Returns if the passenger in on the train
		 * 
		 * @return if the passenger is on the train
		 */
		public boolean isPassengerOnTrain(String nameOfPassenger) {
			boolean onTrain = false;
			for (int i=0;i<passengers.size();i++) {
				if(passengers.get(i).getName().equals(nameOfPassenger)) {
					onTrain = true;
				}
			}
			return onTrain;
		}

		/**Returns the toString if equal to o
		 * @return toString if equal to o
		 */
		public boolean equals(Object o) {
			return this.toString().equals(o.toString());
		}

		/**Returns a user- friendly String version of the passenger and if they are on the train
		 * @return the passenger and if they are on the train
		 */
		public String toString() {
			String output = getName()+":\n";
			for (int i=0;i<passengers.size();i++) {
				output += (i+1) +"-"+ passengers.get(i).toString()+"\n";
			}
			return output;
		}
	}


