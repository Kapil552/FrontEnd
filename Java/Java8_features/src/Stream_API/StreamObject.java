package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		//1. blank
		Stream<Object> emptyStream=Stream.empty();
		
		
		//2. array, object, collection
		String name[]= {"Ankit" ,"Sumit", "Rahul", "Kapil"};
		
		Stream<String> stream = Stream.of(name);
		
		stream.forEach(e->{
			System.out.println(e);
		});
		
		//3. Stream builder
		Stream<Object> streambuilder = Stream.builder().build();
		
		//4. 
		IntStream stream1 = Arrays.stream(new int[] {2,6,10,15,123,56});
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//5. List, Set
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(12);
		list2.add(24);
		list2.add(3);
		list2.add(27);
		list2.add(46);
		list2.add(53);
		
		Stream<Integer> stream2=list2.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
	}

}
