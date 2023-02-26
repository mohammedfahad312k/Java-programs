package cm.StringPograms;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[]= new char[] {'f','a','h','a','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		String s1= new String(ch);
		System.out.println(s1);
	}

}
