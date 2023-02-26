package com.fahadprograms;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a1= {1,2,3,4,66,6,7};
		int []a2= {1,2,3,4,5,6,7,5,7,};
		
		
		boolean status =true;
		if(a1.length==a2.length) {
			
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
				
			}
		}
		
		else {
			System.out.println("cant compare because the arrays conetent not matching");
		}
	

	if(status == true) {
		System.out.println("the boths arrays are equals");
	}
	else {
		System.out.println("not equals");
	}
	
		
			}
		}

	
