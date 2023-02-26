package cm.StringPograms;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args)
	{
	System.out.println("Enter the length/size of the array:");
	Scanner sc = new Scanner(System.in);
	
	int num= sc.nextInt();
	int a[] = new int[num];
	
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
		for (int i =0;i<a.length ;i++)
		{
		 if(a[i]!=a[i+1]) {
				System.out.println(a[i]);
			
			
		}
			
		
	}
	}
}

