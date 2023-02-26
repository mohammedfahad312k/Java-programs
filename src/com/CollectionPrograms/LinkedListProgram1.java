package com.CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram1 {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("A");
		ll.add("FAHAD");
		ll.add("khan");
		ll.add("TRUE");
		ll.add("syed");
		ll.add("A");
		System.out.println(ll);
		
		//ll.add(2,111111);
		//System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.set(4,"mohammed");
		System.out.println(ll);
		
		System.out.println(ll.contains("java"));
		System.out.println(ll.contains("mohammed"));
		
		
		ll.push("khan");
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		
		// for loop using linkedlist
		
		/*for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}*/
		
		//using for.. each loop
		
		/*for(String value:ll) {
			System.out.println(value);
		}*/
		
		
		//using iterator as amethod
		
		Iterator it= ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	

	}

}
