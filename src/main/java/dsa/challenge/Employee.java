package dsa.challenge;

public class Employee {

	private String name;
	private int id;
	private int salary;

	public Employee(String string, int i, int j) {
		this.name = string;
		this.id = i;
		this.salary = j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
