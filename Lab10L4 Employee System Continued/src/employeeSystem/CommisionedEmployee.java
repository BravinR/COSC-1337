package employeeSystem;

public class CommisionedEmployee {
/**Encapsulates information about an employee that is paid based on employee(Lab10L4)
 * 
 */
	public CommissionedEmployee() {
		/**The amount the employee sold*/
		protected double grossSales;
		/**The percentage the employee gets paid of the amount he/she sold*/
		protected double commissionRate;
		/**Creates a new CommissionEmployee with incoming parameters
		 * 
		 * @param firstName
		 * @param lastName the last name if the employee
		 * @param eid the id of the employee
		 * @param commissionRate the 
		 */
		public CommissionedEmployee(String firstName, String lastName, String eid, double commisionRate){
			super(firstName,lastName, eid);
			setGrossSales(0.0);
			setCommissionRate(0.0);	
		}
		/**Returns the gross sales for this period
		 * @return 
		 */
		public void setGrossSales(double grossSales) {
			this.grossSales =(grossSales>=0?grossSales:0);
		}
		public double getCommissionRate() {
			return commissionRate;
		}
		public void setCommissionRate(double commissionRate) {
			this.commissionRate = (commissionRate>=0 && commissionRate<=1.0?commissionRate:0.0);
		}
		@Override
		public String toString() {
			return "Commissioned "+super.toString()+"\nCommission Rate: "
		}
	}
}
