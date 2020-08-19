package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployee {

	public static void main(String[] args) {
		Employee[] employee = {
		new Employee("James", "Indigo", 4700.77, "Marketing"),
		new Employee("Luke", "Indigo", 6200, "IT"),
		new Employee("Jason", "Blue", 3200, "Sales"),
		new Employee("Wendy", "Brown", 4236.4,"Finance")};
		
		List<Employee> list = Arrays.asList(employee);
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);
		
		Predicate<Employee> fourToSixThousand = 
				e -> (e.getSalary() >= 400 && e.getSalary() <= 6000);
		System.out.printf("%nEmployee earning $4000 - $6000 per month sorted by salary: %n");
		list.stream()
		.filter(fourToSixThousand)
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(System.out::println);
		
		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
				list.stream()
				.filter(fourToSixThousand)
				.findFirst()
				.get());
		
				
				
	}

}
