package assessment_2;

import java.util.Scanner;

class Person {
	private String name;
	private int age = 18;

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your name:");
		String username = myobj.nextLine();
		Person person = new Person(username, 18);
		person.display();

	}

	 Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("My name is " + name + " and my age is " + age);
	}

}
