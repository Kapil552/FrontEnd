package Lambda_Expression;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable thread1 = () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("value of i is: " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(thread1);
		thread.setName("John");
		thread.start();
		
		Runnable thread2=() -> {
			try {
				for(int i=0; i<=10; i++) {
					System.out.println(i*2);
					 Thread.sleep(2000);
				}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		};
		
		Thread thread3=new Thread(thread2);
		
		thread3.start();
	
	}
}
