package Nonemplyarray;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target : ");
		int target=sc.nextInt();
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1;j<nums.length; j++) {
				
				if(nums[i]+nums[j]==target) {
					System.out.println(i+ " " +j);
				}
				
			}
			System.out.println("Numbers not found");
			break;
		}
	}
}
