package assessment_4;

import java.util.*;

public class HashMapStudent {

	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("                         Welcome to the student record");
		int input = 0;
		while (input != 4) {
			System.out.println("1.Add Student");
			System.out.println("2.Remove Student");
			System.out.println("3.Search Student");
			System.out.println("4.exit");
			System.out.println("*****Select the above Option to proceed*****");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("Enter the student headcount:");
				int headcount = sc.nextInt();
				for (int i = 0; i < headcount; i++) {
					System.out.println("Enter the student " + (i + 1) + " name to add:");
					String addstu = sc.next();
					System.out.println("Enter the student " + (i + 1) + " Grade to add:");
					int grade = sc.nextInt();
					student.put(addstu, grade);

				}
				System.out.println("                      Student details Added successfully");
			} else if (input == 2) {
				System.out.println("Enter the name to remove the student");
				String removestudent = sc.next();
				student.remove(removestudent);
				System.out.println("                  Student details removed");
			} else if (input == 3) {
				System.out.println("Enter the name to Search the student grade");
				String search = sc.next();
				Integer grade = student.get(search);
				if (grade != null) {
					System.out.println("Student details are: " + grade);
				} else {
					System.out.println("                   Student details not found ");
				}

			} else {
				System.out.println("Exit");
				System.out.println("                                                         THANK YOU");
				
			}

		}
	}
}
