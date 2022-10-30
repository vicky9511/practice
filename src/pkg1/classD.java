package pkg1;

import java.util.Arrays;

public class classD {

	public static void main(String[] args) {
	for(int i=1;i<200;i++) {
		int b = i;
		int c = 0;
		while(b!=0) {
			int rem = b % 10;
			b/=10;
			c=c*10+rem;
		}
	if(i==c)
		System.out.println(i+ " ");
	}
    
	
	
	
	
	System.out.println("==============================================");
	int a = 11;
	int count = 0;
	int b = a ;
	while(b>0) {
		int k = a%b;
		if(k==0) {
			count++;
		}
		b--;
	}
	if(count==2)
	System.out.println( "number is prime number");
	else
		System.out.println("number is not prime number");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
