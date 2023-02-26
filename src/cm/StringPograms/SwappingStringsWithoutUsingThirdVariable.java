package cm.StringPograms;

public class SwappingStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "hi had ur dinner?";
		String b= "hmmmm";
		
		System.out.println("strings before swapping:"+a);
		System.out.println("strings before swapping:"+b);
		
		a= a+b;
		b=a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println();
		System.out.println("strings After  swapping:"+a);
		System.out.println("strings After swapping:"+b);
		
		
		

	}

}
