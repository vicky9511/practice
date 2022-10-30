package pkg3;

import java.util.HashSet;

public class classC {
	
	
	
	

	public static void main(String[] args) {
		HashSet<Object> hset = new HashSet<>();
		
		hset.add("mumbai");
		hset.add("pune");
		hset.add("nagar");
		hset.add("kolhapur");
		hset.add("satara");
		hset.add("nashik");
		
		System.out.println(hset);
		
		for(Object k : hset ) {
			System.out.println(k);
			
		}
			
		
		
		
	}

}
