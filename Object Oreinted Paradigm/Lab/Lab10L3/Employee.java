/*Bravin Rutto
 * COSC 1337 001
 * 11/8/2021
 * Purpose: To encapsulate information about a Employee (Lab10L3)
 */

package employeeSystem;

/** Encapsulates the general idea of a Employee
 * @author Bravin
 *
 */
public class Employee {
	/**the first name of the employee*/
	protected String firstName;
	/**the last name of the employee*/
	protected String lastName;
	/**the id number of the employee*/
	protected String eid;
	
	
	/**Makes a new Employee with the input parameters
	 * @param firstName the first name of the employee
	 * @param lastName the last name of the employee
	 * @param eid the id number of the employee
	 */
	public Employee(String firstName, String lastName, String eid) {
		setFirstName(firstName);
		setLastName(lastName);
		setEid(eid);
	}

	/**Gets the first name of the employee
	 * @return the first name of the employee
	 */
	public String getFirstName() {
		return firstName;
	}

	/**Sets the first name of the employee
	 * @param firstName sets the last name of the employee
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**Gets the last name of the employee
	 * @return the last name of the employee
	 */
	public String getLastName() {
		return lastName;
	}

	/**Sets the last name of the employee
	 * @param lastName sets the last name of the employee
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**Gets the employee id of the employee
	 * @return the id of the employee
	 */
	public String getEid() {
		return eid;
	}

	/**Sets the id of the employee
	 * @param eid sets the id of the employee
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	
	/** Returns a user-friendly String representing the employee
	 *
	 * @return the user-friendly String representing the employee
	 */
	@Override
	public String toString() {
		String returnString = "Employee: "+getFirstName()+" "+getLastName()+
				"\nEmployee ID: "+getEid();
		return returnString;
	}
}
