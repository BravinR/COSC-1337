/*Bravin Rutto
 * COSC 1337 001
 * 11/1/2021
 * Purpose: To encapsulate a GroceryStore (Lab10L2)
 */

package typesOfStores;

/**Encapsulates a GroceryStore
 * @author BRutto
 *
 */
public class GroceryStore extends Store {
	/**The annual revenue of the GroceryStore*/
	private double annualRevenue;
	
	/**True if this GroceryStore is part of a chain*/
	private boolean isChain;
	
	/**Constructs a new GroceryStore from the input data
	 * @param name the name of the GroceryStore
	 * @param address the address of the GroceryStore
	 * @param annualRevenue the annual revenue of the GroceryStore
	 * @param isChain true if this GroceryStore is part of a chain
	 */
	public GroceryStore(String name, String address, double annualRevenue, boolean isChain) {
		super(name, address);
		this.annualRevenue = annualRevenue;
		this.isChain = isChain;
	}

	/**Returns the annual revenue for this store
	 * @return the annualRevenue
	 */
	public double getAnnualRevenue() {
		return annualRevenue;
	}

	/**Sets the annual revenue for this store
	 * @param annualRevenue the annualRevenue to set
	 */
	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	/**Returns true if this store is part of a chain
	 * @return the isChain
	 */
	public boolean isChain() {
		return isChain;
	}

	/**Sets isChain to true if this store should be part of a chain
	 * @param isChain the isChain to set
	 */
	public void setChain(boolean isChain) {
		this.isChain = isChain;
	}
	/**Returns a user friendly version of the Grocery Store
	 * @return the user friendly version of the GroceryStore
	 */
	@Override
	public String toString() {
		return super.toString()+"\n\tAnnual Revenue:"+ getAnnualRevenue() + "\n\tis"+(isChain()?"":" not")+
				" part of a national chain.";
		
	}
	
	

}
