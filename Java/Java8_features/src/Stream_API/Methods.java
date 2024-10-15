package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Ankit", "Sumit", "Rahul", "kapil", "Aman", "Anuj");

		List<String> newStr = str.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newStr);

		List<Integer> integers = Arrays.asList(1, 5, 12, 20, 45, 10);

		List<Integer> newNumbers = integers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumbers);

		
		str.stream().forEach(System.out::println);

		//sorted
		integers.stream().sorted().forEach(System.out::println);
		
		Integer num = integers.stream().min((o1, o2) ->o1.compareTo(o2)).get();
		System.out.println("Minimum num: " +num);
		
		Integer num2 = integers.stream().max(((o1, o2) -> o1.compareTo(o2))).get();
		System.out.println("Maximum num: "+num2);
	}

}
