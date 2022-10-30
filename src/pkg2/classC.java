package pkg2;

import java.util.Arrays;

public class classC {

	public static void main(String[] args) {
		int []a= {52,32,91,73,22,59};
		System.out.println(Arrays.toString(a));
		int count =0;
		for(int i=1;i<a.length;i++) {
			if(a[i]%2==0) {
			count++;
			}
		}
System.out.println(count);
System.out.println("=====================================================================");
String b="below";
String c = "elbow";
if(b.length()==c.length()) {
char[]x=b.toLowerCase().toCharArray();
char[]y=c.toLowerCase().toCharArray();
Arrays.sort(x);
Arrays.sort(y);
if(Arrays.equals(x, y))
	System.out.println("string is anagram");
else
	System.out.println("length is same but string is not anagram");











}
	}

}
