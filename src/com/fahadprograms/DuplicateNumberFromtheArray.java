package com.fahadprograms;

public class DuplicateNumberFromtheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []a= {"java","c++","python","c#","java","c++"};
		
		 boolean flag=true;
		for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
		if(a[i]==a[j]){
		System.out.println("the duplicate number is found:"+ " " + a[i]);
		flag=false;
		}
		}
		}

		if(flag== true){
		System.out.println("duplicate is not found from the array");
	}

		
}
}
