package assessment_2;

import java.util.Scanner;

public class Employee extends BasePerson {

	int empid;
	double salary;

	public Employee(int empid, double salary, String name, int agee) {
		super(name, agee);
		this.empid = empid;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your Empid:");
		int empid = sc.nextInt();
		System.out.println("Enter your age:");
		int agee = sc.nextInt();
		System.out.println("Enter your Salary:");
		double salary = sc.nextDouble();
		Employee employee = new Employee(empid, salary, name, agee);
		employee.display();
	}

	void display() {
		System.out.println("My name is " + name);
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
		System.out.println("Age - " + agee);
	}

}
