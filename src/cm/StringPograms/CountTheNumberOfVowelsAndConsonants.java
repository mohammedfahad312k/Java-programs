package cm.StringPograms;

import java.util.Scanner;

public class CountTheNumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0;
		int ccount=0;
		
		System.out.println("enetr the String:");
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		int len=s1.length();
		s1=s1.toLowerCase();
		for(int i=0;i<=len-1;i++) {
		
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
			vcount++;
		}

		else if(s1.charAt(i)>'a'&& s1.charAt(i)<'z'){
				ccount++;
			}
		}
	
				System.out.println("VOWEL COUNT IS:"+vcount);
				System.out.println("CONSONANT COUNT IS :"+ccount);
		
			
		}


}
