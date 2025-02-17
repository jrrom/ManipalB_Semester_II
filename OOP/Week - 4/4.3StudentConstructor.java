import java.util.Scanner;

class Student {
	String sname;
	int[] marks;
	int total;
	int avgno;
	
	Student() {
		this.sname = "Undefined";
	}
	
	Student(String sname, int[] marks) {
		this.sname = sname;
		this.marks = marks;
	}
	
	public void assign(Scanner sc) {
		System.out.print("Enter name of the student: ");
		this.sname = sc.nextLine();
		System.out.print("Enter number of marks in student: ");
		int n = sc.nextInt();
		System.out.println("Enter marks: ");
		
		this.marks = new int[n];
		for (int i = 0; i < n; i++) {
			this.marks[i] = sc.nextInt();
		}
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
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.assign(sc);
		student.compute();
		student.display();
		
		System.out.println();
		Student assigned = new Student("TestStudent", new int [] {
				70, 80, 90, 90, 85
		});
		assigned.compute();
		assigned.display();
		
		sc.close();
	}

}

/*
Enter name of the student: NewStudent
Enter number of marks in student: 4
Enter marks: 
50 60 65 70
sname: NewStudent
marks: [ 50 60 65 70 ]
total: 245
avgno: 61

sname: TestStudent
marks: [ 70 80 90 90 ]
total: 330
avgno: 82
  */
