package Lambda_Expression;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!!");
		
//		Myinter myinter=new Impl();
//		myinter.test();
		
//		Myinter myinter=new Myinter() {
//			
//			@Override
//			public void test() {
//				
//				System.out.println("this is first anonymous class");
//				
//			}
//		};
//		
//		Myinter myinter2=new Myinter() {
//			
//			@Override
//			public void test() {
//			System.out.println("this is second anonymous class");
//				
//			}
//		};
//		
//		myinter.test();
//		myinter2.test();
		
		//using interface with the help of lambda
		
		Myinter myinter=()->{
			System.out.println("this is lambda expression");
		};
		myinter.test();
		
		
		
		SumInter inter=(a, b) ->a+b;
		
		System.out.println(inter.sum(5, 7));
		System.out.println(inter.sum(6, 7));
		System.out.println(inter.sum(6, 10));
		inter.sum(5, 7);
		
		
		
		LengthInter inter2=str -> str.length();
		
		System.out.println("Length of the given string is: " + inter2.getLength("Hello Indore"));
	}

}
