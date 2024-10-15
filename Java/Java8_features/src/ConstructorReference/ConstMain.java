package ConstructorReference;

public class ConstMain {

	public static void main(String[] args) {
		
		System.out.println("Inside main()");

//		Provider provider=()->{
//			return new Student();
//		};
		
		Provider provider=Student::new;
		
		Student student=provider.getStudent();
		student.display();
	}

}
