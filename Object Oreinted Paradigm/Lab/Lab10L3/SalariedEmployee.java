/*Bravin Rutto
 * COSC 1337 001
 * 11/8/2021
 * Purpose: To encapsulate the idea of a salaried employee (Lab10L3)
 */

package employeeSystem;

/** Encapsulates a Salaried Employee. Extends Employee.
 * @author Bravin
 *
 */
public class SalariedEmployee extends Employee {
	/**The salary of the employee*/
	protected double salary;
	
	
	/** Creates a new Salaried Employee with input parameters
	 * 
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param eid id of the employee
	 * @param salary salary of the employee
	 */
	public SalariedEmployee(String firstName, String lastName, String eid,
			double salary) {
		super(firstName, lastName, eid);
		setSalary(salary);
	}

	
	/** Gets the salary of the employee
	 * @return the salary of the employee
	 */
	public double getSalary() {
		return salary;
	}


	/** Sets the salary of the employee
	 * @param salary sets the salary of the employee
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/** Returns a user-friendly String version of the Salaried Employee
	 *
	 * @return the String
	 */
	@Override
	public String toString() {
		return super.toString()+"\nSalary: "+getSalary();
	}
}
