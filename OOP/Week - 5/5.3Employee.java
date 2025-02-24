import java.util.Scanner;

class Employee {
	class Department {
		String departmentName;
		String location;
		
		Department() {}
		
		Department (String departmentName, String location) {
			this.departmentName = departmentName;
			this.location = location;
		}
		
		public void display() {
			System.out.println("Department " + departmentName + " located at " + location);
		}
	}
	
	String eName;
	double salary;
	Department[] departments;
	
	void addDepartment(int index, String departmentName, String location) {
		this.departments[index]  = new Department(departmentName, location);
	}
	
	Employee(String eName, double salary, Scanner sc) {
		this.eName = eName;
		this.salary = salary;
		
		System.out.print("Enter number of departments: ");
		int n = sc.nextInt();
		sc.nextLine();
		this.departments = new Department[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter department: ");
			String departmentName = sc.nextLine();
			System.out.print("Enter location: ");
			String location = sc.nextLine();
			
			addDepartment(i, departmentName, location);
			System.out.println();
		}
	}
	
	void display() {
		System.out.println();
		System.out.println("Name\t-\t" + eName);
		System.out.println("Salary\t-\t" + salary);
		System.out.println("Departments -");
		for (Department d : departments) {
			System.out.println(d.departmentName + "\tat\t" + d.location);
		}
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee a = new Employee("A", 10000, sc);
		a.display();
		
		sc.close();
	}

}

/*
Enter number of departments: 2
Enter department: Accounting
Enter location: Noida

Enter department: Software
Enter location: Gurugram


Name	-	A
Salary	-	10000.0
Departments -
Accounting	at	Noida
Software	at	Gurugram
*/
