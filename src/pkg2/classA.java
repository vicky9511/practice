package pkg2;

import java.util.Scanner;

public class classA {

	public static void main(String[] args) {
		
		System.out.println("====================================");
		
		String d="jay shree ram";
		System.out.println(d);
		String[]k=d.split(" ");
		String e="";
		for(int i=0;i<k.length;i++) {
			String r = k[i];
			String t="";
			for(int j=r.length()-1;j>=0;j--) {
				t=t+r.charAt(j);
			}
			e=e+t+" ";
		}
		System.out.println(e);
	}

}
