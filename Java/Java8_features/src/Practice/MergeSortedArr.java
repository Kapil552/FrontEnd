package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArr {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 0, 0, 0 }, m = 3, nums2[] = { 2, 5, 6 }, n = 3;

		List<Integer> list = new ArrayList<Integer>();

		IntStream newlist = Arrays.stream(nums1);

		newlist.forEach(e -> {
			list.add(e);
		});

		IntStream newlist3 = Arrays.stream(nums2);

		newlist3.forEach(e -> {
			list.add(e);
		});

	   List<Integer> newlist4 = list.stream().filter(e -> e > 0).sorted().collect(Collectors.toList());

		System.out.println("merged sorted array"+ newlist4);

	}

}
