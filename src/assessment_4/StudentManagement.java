package assessment_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagement {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("                 Welcome to the Student Management System");
			System.out.println("Enter the roll no:");
			int rollno = sc.nextInt();
			System.out.println("Enter the Name:");
			String name = sc.next();
			Pattern p = Pattern.compile("^[a-zA-Z ]*$");
			Matcher m = p.matcher(name);
			if (!m.find()) {
				throw new NameNotValidException("Name contains number or special characters");
			}
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			if (age < 15 || age > 21) {
				throw new AgeNotWithinRangeException("Age is not between 15 and 21");
			}
			System.out.println("Enter the Course name:");
			String course = sc.next();
			StudentTask4 student = new StudentTask4(rollno, name, age, course);
			System.out.println("Student created successfully");
		} catch (AgeNotWithinRangeException e) {
			System.out.println("Inside AgeNotWithinRangeException");
			e.printStackTrace();
		} catch (NameNotValidException e) {
			System.out.println("Inside NameNotValidException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Inside Exception");
			e.printStackTrace();
		}

	}

}
