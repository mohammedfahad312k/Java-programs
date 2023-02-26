package com.CollectionPrograms;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> a= new LinkedList<Integer>();
		
		for(int i=0;i<=100;i++) {
			a.add(i);
		}
			System.out.println(a);
		
		Scanner s= new Scanner(System.in);
		System.out.println("plese enter the number:");
		int num =s.nextInt();
			
			System.out.println("even numbers");
			for(int i=0;i<=num;i++){
			if(i%2==0){
			System.out.println(i);

			}
			}
			System.out.println("odd numbers");
			for(int i=0;i<=num;i++){
			if(i%2!=0){
			System.out.println(i);
			}
			
			
			
	
		/*Iterator it= a.iterator();
		while(it.hasNext()) {
			Integer i= (Integer) it.next();
			if(i%2!=0) {
		System.out.println(i);
			}
			
			System.out.println("even numbers");
			Iterator iq= a.iterator();
			while(iq.hasNext()) {
				Integer j= (Integer) iq.next();
				if(j%2==0) {
			System.out.println(j);
		}
		
			}*/
			}
	}
		
}
	

