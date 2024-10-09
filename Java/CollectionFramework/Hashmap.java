package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		non-generics (old -style)
//		Map map=new HashMap();
//		
//		map.put(1, "Aman");
//		map.put(4, "Sumit");
//		map.put(2, "Rahul");
//		map.put(3, "Aman");
//		
//		System.out.println(map);
		
		
		//Generics (New Style)
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Aman");
		map.put(4, "Sumit");
		map.put(2, "Rahul");
		map.put(3, "Aman");
		
		System.out.println(map);

	}

}
