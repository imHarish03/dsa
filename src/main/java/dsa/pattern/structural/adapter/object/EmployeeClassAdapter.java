package dsa.pattern.structural.adapter.object;


/*An Object adapter: Using composition to transltae*/
public class EmployeeClassAdapter  implements Customer{
	
	private Employee employee;
	

	public EmployeeClassAdapter(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String getName() {
		return this.employee.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.employee.getJobTitle();
	}

	@Override
	public String getAddresss() {
		return this.employee.getOfficeLocarion();
	}

}
