/*Bravin Rutto
 * COSC 1337 001
 * 11/1/2021
 * Purpose: To encapsulate a store (Lab10L2)
 */
package typesOfStores;

import java.util.ArrayList;

/**Encapsulates the general idea of a Store*/
public abstract class Store {
	/**the sales tax rate - to be multiplied by every sale*/
	public final double SALES_TAX_RATE = .006;
	
	/**the name of the store*/
	private String name = "";
	
	/**the address of the store*/
	private String address = "";
	
	/**the current inventory of the store*/
	
	private ArrayList<Object> inventory = new ArrayList<>();
	
	/**Makes a new Store with the input parameters
	 * 
	 * @param name the name of the store
	 * @param address the address of the store
	 */
	public Store(String name, String address) {
		setName(name);
		setAddress(address);
	}

	/**Gets the name of the store
	 * @return the name of the store
	 */
	public String getName() {
		return name;
	}

	/**Sets the name of the store
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**Gets the address of the store
	 * @return the address of the store
	 */
	public String getAddress() {
		return address;
	}

	/**Sets the address of the store
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**Adds an item to this store's inventory
	 * 
	 * @param objectToAdd the item to add
	 */
	public void addToInventory(Object objectToAdd) {
		inventory.add(objectToAdd);
	}
	
	/**Returns whether or not this store should be considered equivalent to the input
	 * 
	 * @param o the object to compare to
	 * @return true iff these objects should be considered equal
	 */
	@Override
	public boolean equals(Object o) {
		//return whether to two object's toString's are equal
		return o.toString().equals(toString());
	}
	
	/**Returns a user-friendly String representing the store
	 * 
	 * @return the user-friendly String representing the store
	 */
	@Override 
	public String toString() {
		String returnString = getName()+": "+getAddress()+"\n\tInventory: ";
		for (Object item:inventory)
			returnString+=item+",";
		return returnString;
	}
}
