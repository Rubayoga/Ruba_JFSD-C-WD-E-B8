package assessment_5;

import java.util.List;
import java.util.stream.Collectors;

public class StringEmpty {

	public static void main(String[] args) {
		List<String> empty = List.of("abc", "", "bc", "efg", "abcd", "", "jkl");
		// way 1-output in Without list
		//empty.stream().filter(v->!v.isEmpty()).forEach(v2 -> System.out.println(v2));
		//way 2-output in list format
		List<String> upperCaseList = empty.stream().filter(v -> !v.isEmpty()).collect((Collectors.toList()));
		System.out.println(upperCaseList);
	}

}
