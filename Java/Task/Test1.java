package Nonemplyarray;

public class Test1 {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2,4,4};
//		int nums[]= {1};
//		int nums[] = { 2, 2, 1 };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if ((i != j) && (nums[i] == nums[j])) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println("Non-repeated Numbers are: " + nums[i]);
			}else {
				System.out.println("Numbers are being repeat");
				break;
			}
		}

	}

}
