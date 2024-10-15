package Nonemplyarray;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of steps: ");
		int n = sc.nextInt();

		int pre = 0;
		int curr = 1;
		int nxt = 0;

		for (int i = 0; i < n; i++) {
			nxt = pre + curr;

			pre = curr;
			curr = nxt;
		}

		System.out.println("Number of Ways of climb stairs: " + nxt);

	}
}


