package pkg2;

import java.util.Arrays;

public class classB {

	public static void main(String[] args) {
	//find largest no of 3 no
		int a=36;
	int b= 49;
	int c=25;
	if(a>b && a>c) {
	System.out.println(a + "is largest no");	
	}else if(b>a && b>c) {
		System.out.println(b + " is largest no");
	}else
		System.out.println(c + "is larges no");
	 System.out.println("==================================================");
	 //even & odd digits in number
	 int d=12345;
	 int e=0;
	 int f=0;
	 while(d>0) {
		 int g = d%10;
		 if(g%2==0) {
			 e++;
		 }else {
			 f++;
		 }
		d=d/10;
		
		 }
	 System.out.println("number of even number :" + e);
	 System.out.println("number of odd number :" + f);
	 System.out.println("===================================================");
	 //reverse the string 
	 String g = "rajveer";
	 System.out.println(g);
	 String h="";
	 for(int i= g.length()-1;i>=0;i--) {
		 h=h+g.charAt(i);
	 }
	 System.out.println(h);
	 System.out.println("===================================================");
	 //swaping 2 numbers
	 int i= 450;
	 int j=232;
	 int k=i;
	 i=j;
	 j=k;
	 System.out.println(i);
	 System.out.println(j);
	System.out.println("===================================================");
	//check no is prime or not 
	int l=11;
	int cout =0;
	int m=l;
	while(m>0) {
		int n=l%m;
		if(n==0)
			cout++;
	m--;
	}
		if(cout==2)
			System.out.println("number is prime number");
		else
			System.out.println("no is not a prime number ");
		 
	System.out.println("======================================================");	 
		 int[] a1= {45,69,8,32,76,85};
		 System.out.println(Arrays.toString(a1));
		 int max=a1[0];
		 
		 for(int i1=1;i1<a1.length;i1++) {
			 
			if(a1[i1]>max) {
				max=a1[i1];
			}
			
		 }
		 System.out.println("maximum number is :"+ max);
		 
		System.out.println("================================================");
		int []z= {52,32,91,73,22,61};
		System.out.println(Arrays.toString(z));
		int min = z[0];
		for(int y=1;y<z.length;y++) {
			if(z[y]< min) {
				min=z[y];
			}
		}
		System.out.println("minimum value is :"+ min); 
		 
	System.out.println("=====================================================");	 
		 
	
		 
	 
}
}