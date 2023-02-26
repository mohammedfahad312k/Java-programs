package com.CollectionPrograms;

import java.util.Stack;

// Stack is last in first out

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s= new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		System.out.println(s);  //[a, b, c, d, e]			
		
		s.pop();
		System.out.println(s); //[a, b, c, d]
		
		s.pop();
		System.out.println(s);  // [a, b, c]
		
		s.pop();
		System.out.println(s);  //	[a, b]
		
		
		//peek method will remove the element with out returning the remaining the other element
		
		System.out.println(s.peek());  //b
		
		System.out.println(s.search("z"));
		//System.out.println(s.capacity());
		System.out.println(s.elementAt(0));
		System.out.println(s.size());
	
	}
}
