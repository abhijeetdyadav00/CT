package Practice;

import java.util.HashMap;

class j{
	
	void v() {
		System.out.println("super class");
	}
	void demo() {
		System.out.println("demo method");
	}
}

public class New extends j {
	
	void v() {
		System.out.println("sub class");
	}
	
	void test() {
		System.out.println("Test method");
	}
	
//	int v() {
//		System.out.println("Sub Class");
//	}
	
	public static void main(String[] args) {
		
		New i= new New();
		i.v();
		i.demo();
		i.test();
		
		j k=new j();
		k.v();
		k.demo();
		
		
		j o=new New();
		o.v();
		o.demo();
		
		
//		System.out.println("Hi");
		main(6);
		
		System.out.println("-----------------------");
		
		int t =main(7);
		int z=t;
		System.out.println(main(9));
//		System.out.println(t);
		System.out.println(z);
	
   }
	
	public static int main(int a) {
		System.out.println("Hello");
//		int a=9;
//		System.out.println(a);
		return a;
	}

}
