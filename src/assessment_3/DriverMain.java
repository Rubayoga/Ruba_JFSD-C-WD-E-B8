package assessment_3;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while (input != 3) {
			System.out.println("1.Calculate Employee income tax");
			System.out.println("2.Calculate Salestax on unit price of product");
			System.out.println("3.Exit");
			System.out.println("*****************Select the above Option to proceed********************");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("Enter the Employee name:");
				String name = sc.next();
				System.out.println("Enter the Employee ID");
				int id = sc.nextInt();
				System.out.println("Enter the Employee annual income");
				double salary = sc.nextDouble();
				Employee emp = new Employee(id, name, salary);
				double incometax = emp.calcTax();
				System.out.println("Your Employee income tax is " + incometax);
				System.out.println("----------------------------------------");
			} else if (input == 2) {
				System.out.println("Enter the product ID");
				int pid = sc.nextInt();
				System.out.println("Enter the product price");
				double price = sc.nextDouble();
				System.out.println("Enter the product Quantity");
				int quantity = sc.nextInt();
				Product product = new Product(pid, price, quantity);
				double salestax = product.calcTax();
				System.out.println("Your Salestax on unit price of product is " + salestax);
				System.out.println("------------------------------------------");
			} else {
				System.out.println("Exit");
				System.out.println("Thank You");
			}
		}
	}
}