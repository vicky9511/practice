package pkg2;

import java.util.Arrays;

public class classF {

	public static void main(String[] args) {
		String a= "below arc";
		String b= "elbow car";
		if(a.length()==a.length()) {
		char[] c= a.toLowerCase().toCharArray();
        char[] d = b.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(d);
			
		if(Arrays.equals(c, d)) {
			System.out.println("strings are anagram");
		}	
		else
			System.out.println("length is same but string is not anagram");
			
		}
		else
			System.out.println("string is not anagram");
}
}
