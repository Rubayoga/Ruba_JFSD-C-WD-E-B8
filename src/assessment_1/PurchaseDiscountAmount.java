package assessment_1;

import java.util.Scanner;

public class PurchaseDiscountAmount {

	public static void main(String[] args) {
		// Purchase amount is input and calculates the final payable amount after
		// applying discount
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total bill amount:");
		double totalbill = sc.nextDouble();
		double discount = 0;
		if (totalbill >= 500 && totalbill <= 1000) {
			discount = 10;
		} else if (totalbill > 1000) {
			discount = 20;
		}
		if (discount > 0) {
			System.out.println("Your discount percentage : " + discount);
			System.out.println(
					"Final payable amount after applying discount : " + (totalbill - (totalbill * discount / 100)));
		} else {
			System.out.println("Your amount is less than Rs.500 so there is no discount");
			System.out.println("Final payable amount : " + totalbill);
		}
	}
}
