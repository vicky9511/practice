package pkg1;

public class classH  {

	public static void main(String[] args) {
		String a= "vikrant shivaji pawade";
		System.out.println(a);
		String[]k=a.split(" ");
		String b="";
		
		for(int j=0;j<k.length;j++) {
			String r = k[j];
		String c="";
		
		for(int i=r.length()-1;i>=0;i--   ) {
			b= b + r.charAt(i);
			
		}
	  b = b + c + " ";
	}
System.out.println(b);
	
	}
}