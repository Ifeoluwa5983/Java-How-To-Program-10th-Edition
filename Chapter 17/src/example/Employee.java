package example;

public class Employee {
		private String firstname;
		private String lastname;
		private double salary;
		private String department;
		
		public Employee(String firstName,String lastName,double salary,String department) {
			this.department= department;
			this.firstname = firstName;
			this.lastname = lastName;
			this.department = department;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		public String name() {
			return String.format("%s %s", getLastname(),getFirstname());
		}
		public String toString() {
			return String.format("%s %s %f %s", getLastname(),getFirstname(),getSalary(),getDepartment());
		}

}
