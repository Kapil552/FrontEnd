package MethodReferences;

import java.time.LocalDate;

public class Stuff {

	public static void doStuff() {
		System.out.println("I am doing a task");
		
		LocalDate date=LocalDate.now();
		System.out.println(date.toString());
	}
	
	public static void threadTask() {
		for(int i=1; i<=10; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
