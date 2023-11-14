class EmpDetails {
	int id;
	String name;
	String dept;
	double salary;
	
	void takeInput(int id, String name, String dept, double salary) {
		// this - refers to the current object
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	void showEmp() {
		System.out.println("Employee Details...");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Dept : " + dept);
		System.out.println("Salary : " + salary);
	}
	
}

public class Employee {
	
	// main - it is the entry point
	// public - because main could be accessible from anywhere
	// static - static methods are loaded into memory with class
	// void - because main returns nothing
	public static void main(String[] args) {
		// System.out.println("Hello World...");
		
		EmpDetails ram = new EmpDetails();
		
//		ram.id = 101;
//		ram.name = "Ram";
//		ram.dept = "IT";
//		ram.salary = 45000.00;
		
		ram.takeInput(101, "Ram", "IT", 45000.00);
		ram.showEmp();
		
//		System.out.println("Employee Details...");
//		System.out.println("ID : " + ram.id);
//		System.out.println("Name : " + ram.name);
//		System.out.println("Dept : " + ram.dept);
//		System.out.println("Salary : " + ram.salary);
		
		EmpDetails shyam = new EmpDetails();
		
//		shyam.id = 102;
//		shyam.name = "Shyam";
//		shyam.dept = "HR";
//		shyam.salary = 55000.00;
		
		shyam.takeInput(102, "Shyam", "HR", 50000.00);
		shyam.showEmp();
		
//		System.out.println("Employee Details...");
//		System.out.println("ID : " + shyam.id);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Dept : " + shyam.dept);
//		System.out.println("Salary : " + shyam.salary);
	}

}
