package assessment_1;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int input = sc.nextInt();
		for (int i = input; i >= 1; i--) {
			for (int j = input; j >= 1; j--) {
				System.out.print(i > j ? i : j);
			}
			System.out.println();
		}
	}
}
