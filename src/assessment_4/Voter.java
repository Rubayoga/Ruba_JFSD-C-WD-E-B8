package assessment_4;

import java.util.Scanner;

public class Voter {

	int voterId;
	String name;
	int age;

	public Voter(int voterId, String name, int age) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the voter Id Number:");
			int voterid = sc.nextInt();
			System.out.println("Enter the voter name:");
			String name = sc.next();
			System.out.println("Enter the voter Age:");
			int age = sc.nextInt();
			if (age < 18) {
				throw new VoterAgeExceptionMessage("Invalid Age for voter");
			}
			Voter obj = new Voter(voterid, name, age);
			System.out.println("voter details in below:");
			System.out.println("Voter Id is " +voterid);
			System.out.println("Voter name is " +name);
			System.out.println("Voter age is " +age);

		} catch (VoterAgeExceptionMessage e) {
			e.printStackTrace();
		}

	}

}
