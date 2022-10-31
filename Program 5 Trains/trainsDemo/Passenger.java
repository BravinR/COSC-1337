/*Bravin Rutto
 * COSC 1337 001
 * 11/26/2021
 * Purpose: To encapsulate information about the passenger(Program 5 Trains)
 */
package trainsDemo;

/**A class that encapsulates information about the passenger
 * 
 * @author Bravin
 *
 */
public class Passenger {
	
	/**Creates name of the passenger
	 */
	private String name;

	/**Boolean to check if in FirstClass
	 */
	private boolean isFirstClass;

	/** Creates a pasenger with a name and checks if in First class
	 * @param name the name of the passenger
	 * @param isFirstClass checks if the passenger is in First class
	 */
	public Passenger(String name, boolean isFirstClass){
		setName(name);
		setFirstClass(isFirstClass);
		
	}
	/**Returns the name of the passenger
	 * 
	 * @return the name of the passenger
	 */
	public String getName() {
		return this.name;
	}

	/**sets the name of the passenger
	 * 
	 * @param name the name of the passenger
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Returns a boolean if in Firclass or not
	 * 
	 * @return true or false if in First class
	 */
	public boolean isFirstClass() {
		return this.isFirstClass;
	}

	/**Sets the first class of the passenger
	 * 
	 * @param isFirstClass the first class of the passenger
	 */
	public void setFirstClass(boolean isFirstClass) {
		this.isFirstClass = isFirstClass;
	}

	/**Returns a boolean if equal or not to o
	 * @return true or false if the toString is equal to o
	 */
	public boolean equals(Object o) {
		return this.toString().equals(o.toString());
		
	}
	/**return an exclamation mark if the passenger is in first class
	 * @return an exclamation mark if the passenger is in first class
	 */
	public String toString(){
		if (isFirstClass) {
			return getName() +":\t!";
		}
			
		return getName();
	}
	
}
