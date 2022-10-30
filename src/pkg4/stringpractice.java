package pkg4;

import java.util.Arrays;
public class stringpractice {

	public static void main(String[] args) {
     
     String a= "below car";
     String b="elbow ar";
     
     if(a.length()==b.length()) {
    	 
    	 char[] c=a.toLowerCase().toCharArray();
    	 char[]d=b.toLowerCase().toCharArray();
    	 
    	 Arrays.sort(c);
    	 Arrays.sort(d);
 
    	 if(Arrays.equals(c, d)) {
    		 
    		 System.out.println("String is anagram");
    	 }else {
    		 
    		 System.out.println("length is same but String is not an anagram");
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
     else {
    	 
    	 System.out.println(" string is not an anagram");
     } 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
				
		
	}

}
