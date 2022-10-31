/*Bravin Rutto
 * COSC 1337 001
 * 11/8/2021
 * Purpose: To encapsulate the idea of the employee's hourly wage (Lab10L3)
 */
package employeeSystem;

/** Encapsulates a Hourly Employee. Extends Employee.
 * @author Bravin
 *
 */
public class HourlyEmployee extends Employee{
	/**The hours the employee worked*/
	protected double hours;
	/**The wages the employee acquired*/
	protected double wage;
	
	/** Creates a new Hourly Employee with input parameters
	 * 
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param eid id of the employee
	 * @param wage wage of the employee
	 */
	public HourlyEmployee(String firstName, String lastName, String eid,
			double wage) {
		super(firstName, lastName, eid);
		setHours(hours);
		setWage(wage);
	}

	/** Gets the hours of the employee
	 * @return the hours of the employee
	 */
	public double getHours() {
		return hours;
	}

	/** Sets the hours of the employee
	 * @param hours sets the hours of the employee
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}

	/** Gets the wage of the employee
	 * @return the wage of the employee
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage sets the wage of the employee
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	/** Returns a user-friendly String version of the Salaried Employee
	 *
	 * @return the String
	 */
	@Override
	public String toString() {
		return super.toString()+"\nWage: "+getWage();
	}
}
