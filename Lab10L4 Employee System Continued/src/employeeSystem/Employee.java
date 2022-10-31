/*Bravin Rutto
 * COSC 1337 001
 * 11/5/2021
 * Purpose: is to encapsulate information about an employee (Lab10L3)
 */
package employeeSystem;

import java.text.NumberFormat;

/**Encapsulates the Employee information
 * @author Bravin
 *
 */
public abstract class Employee {
	/**the Employee's first name*/
	protected String firstName;
	/**this is the Employee's list name*/
	protected String lastName;
	/**this is the Employee's if*/
	protected String eid;
	/**The format for percentages*/
	public static NumberFormat PERCENTAGE = NumberFormat.getPercentInstance();
	/**The format for currency*/
	public static NumberFormat MONEY = NumberFormat.getCurrencyInstance();

	/**Creates a new Employee with the input data
	 * 
	 * @param firstName the first name of the Employee
	 * @param lastName the last name of the Employee
	 * @param eid the id of the Employee
	 */

	public Employee(String firstName,String lastName, String eid) {
		setFirstName(firstName);
		setLastName(lastName);
		setEid(eid);
	}

	/**return the firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**sets the firstName
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**returns the lastName
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**sets the lastName
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**returns the eid
	 * @return the eid
	 */
	public String getEid() {
		return eid;
	}

	/**sets the eid
	 * @param eid the eid to set
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}
	/**Return the earnings for this period
	 * 
	 * @return the earning for this period
	 */
	public abstract double getEarnings();
/**this returns a formated string representation of the Employee
 *
 * @return a formated string representation of the Employee
 */
	@Override
	public String toString() {
		return "Employee: " + getFirstName() + " " + getLastName() + "\nEmployee ID: " + getEid();
	}
}
