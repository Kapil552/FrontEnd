package MethodReferences;

public class MethodRef {

	public static void main(String[] args) {
		
		System.out.println("Inside main()");
		
//		MethodInter inter=() -> {
//			System.out.println("This is doTask Method");
//			
//		};
		
		MethodInter inter=Stuff::doStuff;
		inter.doTask();
		
		Runnable runnable=Stuff::threadTask;
		
		Thread thread=new Thread(runnable);
		thread.start();
		
		
	}

}
