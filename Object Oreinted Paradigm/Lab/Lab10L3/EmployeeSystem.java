/*Bravin Rutto
 * COSC 1337 001
 * 11/8/2021
 * Purpose: To test our employee system (Lab10L3)
 */
package employeeSystem;

/**class to test Employees*/
public class EmployeeSystem {

	/**tests Employees
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		//create an object from each object class in the system and print
		Employee joe = new Employee("Joe", "Jones", "222-222222");
		System.out.println(joe+"\n");
		joe.setFirstName("Joseph");
		
		SalariedEmployee joan = new SalariedEmployee("Joan", "Joslin", "333-333333", 800.00);
		System.out.println(joan+"\n");
		joan.setLastName("Mallory");
		
		HourlyEmployee jan = new HourlyEmployee("Jan", "Johnson", "444-4444", 15.75);
		System.out.println(jan+"\n");
		jan.setEid("111-11111");
		
		
		System.out.println(joe+"\n");
		System.out.println(joan+"\n");
		System.out.println(jan+"\n");
	}

}