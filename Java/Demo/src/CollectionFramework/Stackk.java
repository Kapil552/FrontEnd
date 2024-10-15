package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		
		Stack<Integer> st= new Stack<Integer>();
		
		st.push(15);
		st.push(50);
		st.push(10);
		st.pop();
		Iterator itr=st.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
