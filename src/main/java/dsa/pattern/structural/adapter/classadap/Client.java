package dsa.pattern.structural.adapter.classadap;

public class Client {

	public static void main(String[] args) {

		EmployeeClassAdapter emp = new EmployeeClassAdapter();
		populateData(emp);

		BusinessCardDesigner bu = new BusinessCardDesigner();
		String st = bu.designCard(emp);
		System.out.println(st);

	}

	private static void populateData(Employee employee) {
		employee.setFullName("Hari");
		employee.setJobTitle("Architect");
		employee.setOfficeLocarion("BLR");
	}

}
