import java.util.Arrays;
import java.util.List;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,5,10,55,62,15);
		System.out.println(list);
		
//		list.stream().forEach(e->{
//			System.out.println(e);
//		});
		
		list.stream().forEach(System.out::println);
	}

}
