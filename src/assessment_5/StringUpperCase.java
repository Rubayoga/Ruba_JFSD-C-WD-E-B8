package assessment_5;

import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {

	public static void main(String[] args) {
		
		List<String> nameList = List.of("aBc", "d", "ef");
		List<String> upperCaseList = nameList.stream().map(name -> name.toUpperCase()).collect((Collectors.toList()));
		System.out.println(upperCaseList);
	}

}
