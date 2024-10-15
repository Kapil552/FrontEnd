package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {

		List<String> list=new LinkedList<String>();
		
		list.add("Indore");
		list.add("Bhopal");
		list.add("Delhi");
		list.add("Sagar");
		list.add("Indore");
		list.add(null);
		list.add(null);
		list.set(0, "Sagar");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
