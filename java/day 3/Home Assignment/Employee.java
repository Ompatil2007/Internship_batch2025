package Demo.java;

public class Employee {
	   String name;
	    int id;
	    static int employeeCount = 0;
	public Employee(String name, int id) {
		// TODO Auto-generated constructor stub
		  this.name = name;
	        this.id = id;
	        employeeCount++; // Increment every time new employee is created
	    }

	    public void displayEmployee() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee("Alice", 101);
	        Employee e2 = new Employee("Bob", 102);

	        e1.displayEmployee();
	        e2.displayEmployee();

	        System.out.println("Total Employees: " + Employee.employeeCount);
	}

}
