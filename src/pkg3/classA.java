package pkg3;

import java.util.Arrays;
import java.util.Scanner;

public class classA {

	 static public  void main(String[] args) {
    String a = " jay shree ram ";
    
    String b= "";
    String e="";
    
    for(int i=0;i<a.length();i++) {
    	 char d =  a.charAt(i);
    if(d!=' ') {
    	e=e+d;
    }
    else {
    	b=e+" "+b;
    	e="";
    }
    }
     System.out.println(b);
      
      }



	
	
}