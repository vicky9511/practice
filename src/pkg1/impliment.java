package pkg1;

public class impliment implements interface1,interface2 {

	public static void main (String[]arg) {
impliment a = new impliment();
	a.demo1();
a.demo2();
a.demo3();
a.demo4();
	
	
	}
	
	public void demo1() {
	System.out.println("demomethod1");
}

@Override
public void demo3() {
	System.out.println("demomethod3");
	
}

@Override
public void demo4() {
	System.out.println("demomethod4");
	
}

@Override
public void demo2() {
	System.out.println("demomethod2");
	
}
}
