package pkg3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class class2 {

	public static void main(String[] args) {
		String a = "elbow arc";
		String b = "belo car";
		if(a.length()==b.length()) {
			
			char[]x=a.toLowerCase().toCharArray();
			char[]y=b.toLowerCase().toCharArray();
			
			Arrays.sort(x);
			Arrays.sort(y);
			
			if(Arrays.equals(x, y)){
				System.out.println("string is anagram");
			}else
				System.out.println(" length is same but string is not anagram");
			
			
		}else
			System.out.println("string is not anagram");
			
			
			
			
			
			
			
			
			
			
		
	
	
	
	
	}
	
	
}
