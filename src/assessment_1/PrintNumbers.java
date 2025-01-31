package assessment_1;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// Printing numbers 10 to 50 using for loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the from value:");
		int input1 = sc.nextInt();
		System.out.println("Enter the to value:");
		int input2 = sc.nextInt();
		System.out.println("*****Your Output*****");
		for (int i = input1; i <= input2; i++) {
			System.out.println(i);
		}
	}
}
