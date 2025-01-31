package assessment_1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Reverse number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input = sc.nextInt();
		System.out.println("Reversed number is:");
		while (input > 0) {
			System.out.print(input % 10);
			input = input / 10;
		}
	}
}
