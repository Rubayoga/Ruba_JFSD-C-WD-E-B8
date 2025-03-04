package assessment_4;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		String[] arr={"Sunday","Monday","Tuesday","wednesday","thursday","friday","saturday"};
		try {
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Input to show the day");
				int day=sc.nextInt();
				System.out.print("Your given input is represents -  "+arr[day]);
		}

        catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("You can able to give only an input from 0 to 6");
        }
				
}
}
