package dsa.pattern.structural.adapter.classadap;

/*An cLASS adapter: Using composition to transltae*/
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddresss() {
		return this.getOfficeLocarion();
	}

}
