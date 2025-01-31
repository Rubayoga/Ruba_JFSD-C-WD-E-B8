package assessment_1;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// Smallest number among three number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1:");
		int a = sc.nextInt();
		System.out.println("Enter the value 2:");
		int b = sc.nextInt();
		System.out.println("Enter the value 3:");
		int c = sc.nextInt();
		System.out.println("Among three values smallest value is:");
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
