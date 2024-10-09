package CollectionFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {


		List<Integer> list=new Vector<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(null);
		list.add(null);
		list.set(0, 2);
		
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(list.size());
	}

}
