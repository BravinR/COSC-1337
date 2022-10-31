package employeeSystem;
/**Encompasses information about an employee that is paid by the hour
 * 
 * @author ajirv
 *
 */

public class HourlyEmployee {
/**The employee's hours this period*/
	protected double hours
	/**how much the employee gets paid per period*/
	protected double wage
	/**
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param eid the employees id
	 * @param wage how much the employee gets paid per period
	 */
	public HourlyEmployee(String firstName, String lastName, String eid, double wage) {
		super (firstName, lastName, eid);
		setWage(wage)
		setHours(0);
	}
	/**Returns the number of hours worked
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}
	/**Sets the nmber of hours worked
	 * @param hours the hours to set
	 */
	public void setHours(double hours)
	if (hours>=0.0){
		this.hours = hours;
	}
	/**Returns the pay per hour
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}
	/**Sets the wage per hour
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		if (wage >=0.0)
		this.wage = wage;
	}
	/**Returns the earnings for this period (wage*hours)
	 * 
	 * @return the earnings for this period (wage * hours)
	 */
	@Override
	public double getEarnings() {
		return getWage()*getHours();
	}
	/**Returns a formatted String version of the HourlyEmployee
	 * 
	 * @return the formatted string
	 */
	@Override
	public String toString() {
		return "Hourly"+super.toString()+"\nWage: "+MONEY.format(getWage());
	}

}
