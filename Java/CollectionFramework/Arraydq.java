package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydq {

	public static void main(String[] args) {

		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("Indore");
		dq.add("Bhopal");
		dq.add("Delhi");
		dq.add("Indore");
		
		
		System.out.println(dq);
		
		for(String s: dq) {
			System.out.println(s);
		}
	}

}
