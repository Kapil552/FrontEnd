package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(12);
		list2.add(24);
		list2.add(3);
		list2.add(27);
		list2.add(46);
		list2.add(53);

		List<Integer> list3 = Arrays.asList(23, 47, 54, 61, 78);

		
		//without stream
//		List<Integer> listEven = new ArrayList<Integer>();
//
//		for (Integer i : list2) {
//			if(i%2==0) {
//				listEven.add(i);
//			}
//		}
//		
		System.out.println(list2);
//		System.out.println(listEven);
		
		
		//Using Stream
		
//		Stream<Integer> stream=list2.stream();
//		
//		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//		
//		System.out.println(newList);
		
		List<Integer> newList=list2.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList2=list2.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList2);
	}

}
