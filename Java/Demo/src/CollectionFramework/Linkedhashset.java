package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new LinkedHashSet<String>();

		s.add("Sumit");
		s.add("Rahul");
		s.add("Sumit");
		s.add(null);
		s.add("Manish");

		s.add(null);

		System.out.println(s);
	}

}
