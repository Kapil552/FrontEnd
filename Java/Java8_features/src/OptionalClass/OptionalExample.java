package OptionalClass;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName(){
		String name="Kapil";
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {
		
		
		
//		String str=null;
		String str="Hello Indore...";
		
		
//		if(str==null) {
//			System.out.println("This is null object");
//		}else {
//			System.out.println(str.length());
//		}
		
		Optional<String> optional=Optional.ofNullable(str);
		
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse("No value is present"));
		
		Optional<String> optional2=getName();
		System.out.println(optional2.orElse("No name Found"));
	}

}
