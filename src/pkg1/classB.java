package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class classB {
	

	
	
	

	public static void main(String[] args) {
	
		
	int[]a= {42,95,63,58,37,99};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<(a.length);i++) {
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<=a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
			
			}
			}
		System.out.println(Arrays.toString(a));		
		
	}
	
	}
	
		



