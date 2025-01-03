package dsa.pattern.structural.adapter.object;

public class Client {

	public static void main(String[] args) {

		Employee emp = new Employee();
		populateData(emp);
		EmployeeClassAdapter adapter = new EmployeeClassAdapter(emp);

		BusinessCardDesigner bu = new BusinessCardDesigner();
		String st = bu.designCard(adapter);
		System.out.println(st);
	}

	private static void populateData(Employee employee) {
		employee.setFullName("Hari");
		employee.setJobTitle("Architect");
		employee.setOfficeLocarion("BLR");
	}
}
