package Nonemplyarray;

public class Unsorted {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 1, 2, 4, 8, 11 };
		int len = 1;

		int x = len;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {
				len++; // 5
			}

			if (nums[i] > nums[i + 1] || (i + 2) == nums.length) {
				if (x < len)
					x = len;

				len = 1;
			}

		}
		System.out.println(x);
	}
}
