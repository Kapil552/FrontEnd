package Nonemplyarray;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		String s[]= {"Hello", "world"};
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		
		System.out.println("Enter number of cols: ");
		int cols=sc.nextInt();
		
		String s1="";
		
		for(String s2:s) {
			s1 += s2;
		}
		
		
		char ch []=s1.toCharArray();
		
		
		for(int i=0; i<s.length;i++) {
			
			if(ch.length>cols) {
				System.out.println(s[i]);
			}
		}
		
	}

}
