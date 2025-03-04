package assessment_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackNumbers {
	static Scanner sc = new Scanner(System.in);

	List<Integer> elements = new ArrayList<Integer>();

	void push() {
		System.out.println("Enter the size of the elements");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element" + (i + 1));
			int inp = sc.nextInt();
			elements.add(inp);

		}
		System.out.println("                             Elemets added successfully");
	}

	void pop() {
		System.out.println("Popping the elemetns in stack : " + elements.removeLast());

	}

	void empty() {
		System.out.println("The stack is empty: " + elements.isEmpty());
	}

	public static void main(String[] args) {
		StackNumbers obj = new StackNumbers();
		int input = 0;
		while (input != 4) {
			System.out.println("1.Pushing Elemets in the stack:");
			System.out.println("2.Popping Elemets from the stack:");
			System.out.println("3.Empty the Stack");
			System.out.println("4.Exit");
			System.out.println("Select the any one option in the below:");
			input = sc.nextInt();
			if (input == 1) {
				obj.push();

			} else if (input == 2) {
				obj.pop();
			} else if (input == 3) {
				obj.empty();
			} else {
				System.out.println("Exit");
			}
		}

	}

}
