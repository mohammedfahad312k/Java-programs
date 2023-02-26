package com.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList2 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//ArrayList<Integer> a1= new ArrayList();
			
			ArrayList<String> a1= new ArrayList();

			a1.add("X");
			a1.add("Y");
			a1.add("Z");
			a1.add("K");
			a1.add("L");
			a1.add("M");
			a1.add("A");
			a1.add("B");
			a1.add("C");
			
			/*a1.add(5);		
			a1.add(4);
			a1.add(3);
			a1.add(2);
			a1.add(1); */
			
			System.out.println(a1);
			
			//array list for addall method
			/*ArrayList a1_duplicate= new ArrayList();
			
			a1_duplicate.addAll(a1);
			System.out.println(a1_duplicate);
			
			a1_duplicate.removeAll(a1);
			System.out.println("after removing all the element from a1_duplicate:"+a1_duplicate);*/

			
			// sorting  collection.sort()
			
			System.out.println("Element  before the sorting in the arrayList:"+a1);
			Collections.sort(a1);
			System.out.println("Element after the sorting in the arraylist:" + a1);
		
			Collections.sort(a1,Collections.reverseOrder());
			System.out.println("element after sorting in reverse oder:" +a1);
			

			//shuffling  
			Collections.shuffle(a1);
			System.out.println("element after shuffling:" +a1);
		}

	}

