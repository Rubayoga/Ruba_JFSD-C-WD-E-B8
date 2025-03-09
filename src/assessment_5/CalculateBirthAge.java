package assessment_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateBirthAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Birthday Date in below format");
		System.out.println("YYYY-MM-DD : "); 
		String date = sc.next();
		String[] dateArr = date.split("-");
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]),
				Integer.parseInt(dateArr[2]));
		Period period = Period.between(birthDate, currentDate);
		System.out.println("Your age is : " + period.getYears() + " years, " + period.getMonths() + " months, and "
				+ period.getDays() + " days.");
	}

}
