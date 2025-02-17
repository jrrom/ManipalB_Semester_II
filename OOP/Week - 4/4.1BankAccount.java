class BankAccount {
	String name;
	int account;
	String type;
	double balance;
	static double roi = 3.0;
	
	BankAccount() {
		this.name = "Undefined";
		this.account = -1;
		this.type = "Undefined";
		this.balance = 0;
	}
	
	BankAccount(String name, int account, String type, double balance) {
		this.name = name;
		this.account = account;
		this.type = type;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		if (balance - amount < 0) {
			System.out.println("Invalid Withdrawal");
			return;
		}
		balance -= amount;
	}
	
	void display() {
		System.out.println("Name:\t" + name);
		System.out.println("Account No.:\t" + account);
		System.out.println("Account Type:\t" + type);
		System.out.println("Balance:\t" + balance);
	}
	
	static void displayROI() {
		System.out.println("The ROI is " + roi + "%");
	}
}



public class Main {
	public static void main(String[] args) {
		BankAccount def1 = new BankAccount();
		def1.display();
		System.out.println();
		
		BankAccount person = new BankAccount("Person", 1234, "Saving", 1000.0);
		person.display();
		
		person.deposit(500);
		person.withdraw(200);
		
		System.out.println();
		person.withdraw(10000);
		System.out.println();
		
		person.display();
		
		System.out.println();
		BankAccount.displayROI();
	}

}

/*
Name:	Undefined
Account No.:	-1
Account Type:	Undefined
Balance:	0.0

Name:	Person
Account No.:	1234
Account Type:	Saving
Balance:	1000.0

Invalid Withdrawal

Name:	Person
Account No.:	1234
Account Type:	Saving
Balance:	1300.0

The ROI is 3.0%
*/
