package com.CollectionPrograms;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Queue is first in first out

		//LinkedList q= new LinkedList();
		
		PriorityQueue q= new PriorityQueue();
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		System.out.println(q);  //[a, b, c, d]
		
		q.poll();
		System.out.println(q);  //[b, d, c]
			
		q.poll();
		System.out.println(q); //	[c, d]
		q.poll();
		System.out.println(q);   //	[d]
		
		
		
	}

}
