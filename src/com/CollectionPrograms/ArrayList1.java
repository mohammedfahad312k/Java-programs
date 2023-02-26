package com.CollectionPrograms;
import java.util.*;
public class ArrayList1 {

		public static void main(String[] args)
		{
		
			//declaring ArrayList

			//ArrayList al= new ArrayList(); 
			//ArrayList <String> al= new ArrayList<String>();
			//List a= new ArrayList();
			//ArrayList <Integer> al= new ArrayList<Integer>(); 
			
			ArrayList al= new ArrayList(); 
			
			
			//add new element to arraylist
			al.add(123);
			al.add("A");
			al.add("fahad");
			al.add(12.33);
			al.add("true");
			al.add("syed");
			al.add(87654);

			System.out.println(al);
			
			
			//size()
			/*System.out.println(al.size());
			
			//get()
			System.out.println(al.get(3));
			
			//to remove() the object.
			al.remove(4);
			 System.out.println(al);
			 
			//insert a new element
				al.add(4, "mohammed fahad");
				System.out.println(al);
				
				
				//to insert or replace or chance the element with set()
				al.set(1, 88610);
				System.out.println(al);
				
				
				// search the element -contain()--> retun true or false
				System.out.println(al.contains(12.33));*/
			
			
			/*1) using for loop
			System.out.println("reading the element using for loop as a condition");
			for(int i=0;i<=al.size()-1;i++) {
				
				System.out.println(al.get(i));
				
			}*/
			
			
			
			/*using each for loop
			System.out.println("reading the element using for each loop as a condition");
			for(Object e:al) {
				System.out.println(e);
			}*/
			
			
			//using iterator
			System.out.println("reading the element using iterator as as method where printing the element and moving to next element");
			
			Iterator it= al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());  //printing the element and moving to next element
			}
		}
		
	}



