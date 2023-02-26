package com.CollectionPrograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add("fahad");
		l1.add("z");
		l1.add("null");
		l1.add("A");
		l1.add("fahad");
		System.out.println(l1);
		System.out.println(l1.size());
		
		/*Iterator tt= l1.iterator();
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}*/
		
		
		//collectons ---sort method
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		
		System.out.println(l1);
		
		
		Collections.shuffle(l1);
		System.out.println(l1);
		
	}

}
