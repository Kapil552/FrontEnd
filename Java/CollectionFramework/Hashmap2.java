package CollectionFramework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	public static void main(String[] args) {
		// Comparing by key in Descending order

		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "Shankar");
		map.put(102, "Sohan"); 
		map.put(103, "Radha"); 
		
		System.out.println(map.entrySet());
		
		System.out.println(map.entrySet().stream());
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
