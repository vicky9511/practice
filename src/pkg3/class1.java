package pkg3;

import java.util.ArrayList;
import java.util.Collections;

public class class1 {
	public static void main(String []args) {

	ArrayList<Integer> list = new ArrayList<>();
	
	list.add(123);
	list.add(423);
	list.add(495);
	list.add(753);
	list.add(159);
	list.add(687);
	
	
	System.out.println(list);
 System.out.println(list.get(3));
 
 System.out.println(list.set(4, 693));
 
 Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	
	
	
	
	
	
	}	
	
}
