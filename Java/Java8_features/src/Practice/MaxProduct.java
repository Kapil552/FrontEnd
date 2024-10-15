package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxProduct {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4 };
		
		List<Integer> list = new ArrayList<Integer>();

		IntStream newlist = Arrays.stream(nums);

		newlist.forEach(e -> {
			list.add(e);
		});

		List<Integer> newlist2 = list.stream().filter(e -> e > 0).sorted().collect(Collectors.toList());
		
		
	}

}
