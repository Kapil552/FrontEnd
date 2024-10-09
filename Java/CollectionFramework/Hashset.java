package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		s.add("Sumit");
		s.add("Rahul");
		s.add("Sumit");
		s.add(null);
		s.add("Manish");
		
		s.add(null);
		
		System.out.println(s);

	}

}
