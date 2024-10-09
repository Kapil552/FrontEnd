package CollectionFramework;

import java.util.*;

public class Arraylist  {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Indore");
		list.add("Bhopal");
		list.add("Delhi");
		list.add("Sagar");
		list.add("Indore");
		list.add(null);
		list.add(null);
		
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

		System.out.println(list.contains("Delhi"));
		System.out.println(list.size());
	}

}
