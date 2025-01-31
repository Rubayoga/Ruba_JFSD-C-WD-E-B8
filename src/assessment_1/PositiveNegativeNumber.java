package assessment_1;

import java.util.Scanner;

public class PositiveNegativeNumber {
	
	public static void main(String[] args) {
		// Given number positive or negative
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("The Given number is Positive ");
		} else if (input < 0) {
			System.out.println("The Given number is Negative ");
		} else {
			System.out.println("The Given number is Zero ");
		}
	}
}
