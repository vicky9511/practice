package pkg1;

public class classG extends classF {
 

	public static void main(String[] args) {
		classG a = new classG();
		a.demo(46, 96);
		classF b = new classF();
		b.demo(46, 96);
		
	}
public  void demo(int x, int y) {
	int c=x+y;
	System.out.println( c);
}
}
