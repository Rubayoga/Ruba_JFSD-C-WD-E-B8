package assessment_5;

import java.util.List;
import java.util.stream.Collectors;

public class StudentNameA {

	public static void main(String[] args) {
		List<String> studentNames = List.of("Abi", "Ruba", "Yoga", "Lakshara", "Abdul", "Akash", "Vedha", "Vidhushna",
				"Sanvitha", "Shruthishna");
		List<String> studentNamesA = studentNames.stream().filter(name -> name.startsWith("A"))
				.collect((Collectors.toList()));
		System.out.println(studentNamesA);
	}

}
