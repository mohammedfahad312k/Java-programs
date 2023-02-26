package com.CollectionPrograms;
import java.util.*;
import java.util.Arrays;

public class ArrayList3 {
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			// array 
			String arr [] = {"dog","cat","elephant"};
			
			for(Object value:arr) {
				System.out.println(value);	
			}
			
			
			// ArayList feom array 
			ArrayList al= new ArrayList(Arrays.asList(arr));
			System.out.println(al);

		}

	

}
