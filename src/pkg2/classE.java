package pkg2;

import java.util.Arrays;

public class classE {

	public static void main(String[] args) {
		String a = "vikrant shivaji pawde";
		System.out.println(a);
		String[]c=a.split(" ");
		String b="";
		for(int j=0;j<c.length;j++) {
			String m =c[j];
			String f="";
		for(int i=m.length()-1;i>=0;i--) {
			f=f+a.charAt(i);
		}
			b=b+f+" ";
			
		}	
			System.out.println(b);
		}

	}


