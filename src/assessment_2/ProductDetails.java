package assessment_2;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the product name:" + (i + 1));
			System.out.println("Enter the product ID :");
			int pid = sc.nextInt();
			System.out.println("Enter the product price :");
			double price = sc.nextDouble();
			System.out.println("Enter the product Quantity :");
			int quantity = sc.nextInt();
			products[i] = new Product(pid, price, quantity);
		}
		double max = 0;
		int maxPid = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].price > max) {
				max = products[i].price;
				maxPid = products[i].pid;
			}
		}
		System.out.println("Pid of the product with the highest price : " + maxPid);
		ProductDetails obj = new ProductDetails();
		System.out.println("Total amount spent on all products : " + obj.totalAmount(products));
	}

	private double totalAmount(Product[] products) {
		double totalAmount = 0;
		for (int i = 0; i < products.length; i++) {
			double tot = products[i].price * products[i].quantity;
			totalAmount = totalAmount + tot;
		}
		return totalAmount;
	}
}