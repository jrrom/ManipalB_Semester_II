import java.util.Scanner;

class Student {
	String sname;
	int[] marks;
	int total;
	int avgno;
	
	public void assign() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name of the student: ");
		this.sname = sc.nextLine();
		System.out.print("Enter number of marks in student: ");
		int n = sc.nextInt();
		System.out.println("Enter marks: ");
		
		this.marks = new int[n];
		for (int i = 0; i < n; i++) {
			this.marks[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	public void display() {
		System.out.println("sname: " + this.sname);
		System.out.print("marks: [ ");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
		System.out.println("]");
		if (total != 0) {
			System.out.println("total: " + this.total);
			System.out.println("avgno: " + this.avgno);
		}
	}
	
	public void compute() {
		for (int n : marks) {
			this.total += n;
		}
		this.avgno = this.total / this.marks.length;
	}
}


public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.assign();
		student.compute();
		student.display();
	}

}
