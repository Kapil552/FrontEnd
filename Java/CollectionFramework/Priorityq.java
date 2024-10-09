package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityq {

	public static void main(String[] args) {

		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(22);
		q.add(50);
		q.add(45);
		q.add(20);
		
		System.out.println(q);
		
		
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
	
	}

}
