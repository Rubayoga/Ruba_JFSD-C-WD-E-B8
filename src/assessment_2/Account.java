package assessment_2;

import java.util.Scanner;

public class Account {

	private double balance;

	public Account() {
		super();
	}

	public Account(Double balance) {
		super();
		this.balance = balance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account obj = new Account();
		int input = 0;
		while (input != 4) {
			System.out.println("               *********Welcome to the XYZ banking********** ");
			System.out.println("1.Deposit amount");
			System.out.println("2.withdraw amount");
			System.out.println("3.Account Balance");
			System.out.println("4.Exit");
			System.out.println("       *****Select the above Option to proceed*****");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("Enter the deposit amount:");
				double deposit = sc.nextDouble();
				obj.deposit(deposit);
				obj.display();

			} else if (input == 2) {
				System.out.println("Enter the withdraw amount:");
				double withdraw = sc.nextDouble();
				obj.withdraw(withdraw);
			} else if (input == 3) {
				obj.display();
			}
		}
		System.out.println("Exit");

	}

	void deposit(double newamount) {
		balance = balance + newamount;
		System.out.println("        Your deposit amount is " + newamount);
	}

	void display() {
		System.out.println("        Your current balance is " + balance);
	}

	void withdraw(double remainingamount) {
		balance = balance - remainingamount;
		System.out.println("        After withdraw your current balance is " + balance);
	}
}