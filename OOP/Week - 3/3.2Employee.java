import java.util.Scanner;

class Employee {
	String Ename;
	int Eid;
	double Basic;
	double DA;
	double Gross_Sal;
	double IT;
	double Net_Sal;
	
	public void read(Scanner sc) {
		System.out.print("Enter name: ");
		this.Ename = sc.nextLine();
		System.out.print("Enter id: ");
		this.Eid = sc.nextInt();
		System.out.print("Enter basic: ");
		this.Basic = sc.nextDouble();
	}
	
	public void compute_net_sal() {
		this.DA = Basic * 0.52;
		this.Gross_Sal = Basic + DA;
		this.IT = Gross_Sal * 0.3;
		
		this.Net_Sal = Gross_Sal - IT;
	}
	
	public void display() {
		System.out.println("Ename: " + Ename);
		System.out.println("Eid: " + Eid);
		System.out.println("Basic: " + Basic);
		System.out.println("DA: " + DA);
		System.out.println("IT: " + IT);
		System.out.println("Gross Salary: " + Gross_Sal);
		System.out.println("Net Salary: " + Net_Sal);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		employee.read(sc);
		employee.compute_net_sal();
		employee.display();

		sc.close();
	}
}
