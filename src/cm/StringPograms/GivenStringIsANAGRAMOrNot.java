package cm.StringPograms;

import java.util.Arrays;
import java.util.Scanner;

public class GivenStringIsANAGRAMOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

Scanner s= new Scanner(System.in);
System.out.println("eneter the String 1:" );
String s1=s.nextLine();
System.out.println("eneter the String 1:" +s1 );

System.out.println();

Scanner sc= new Scanner(System.in);
System.out.println("eneter the String 2:");
String s2=s.nextLine();
System.out.println("eneter the String 2:" +s2);
System.out.println();
		
		//String s1= "bus";
		//String s2= "rac";
		
		if(s1.length()!=s2.length()) {
			System.out.println("to equivent to Strings are not ANAGRAM:");
			System.exit(0);
		}
		
		char a[]= s1.toCharArray();
		char b[]= s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		if(Arrays.equals(a, b)) {
			System.out.println("the Strings are ANAGRAM");
			
		}
		else {
			System.out.println("strings are not anagram");
		}
	}
	

}
