package dsa.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Others {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("George", 20, 10000), new Employee("Robert", 123, 15000),
				new Employee("Kathy", 2, 25000));

		employees.sort(Comparator.comparing(Employee::getId).reversed());
		//employees.forEach(System.out::println);

		employees.forEach(c -> System.out.println(c.getName()));
	}

}
