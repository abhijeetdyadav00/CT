package Practice;



public class Exceptions {

//	static int a=10;
//	int b=11;
	
	
//	Test3(){
//		System.out.println("hii");
//	}
	
//	void method() {
//		System.out.println("Method 1");
//		int a=0;
//		System.out.println(a);
//		System.out.println(this.a);
//	}
//	
//	static void method2() {
//		System.out.println("Method 2");
//	}
//	Test3(int a){
//		System.out.println("Hii");
//	}
	
	
	
	public static void main(String[] abhi) {
		
		int a=4;
		int b=0;
		

		
		
			int z[]= {1,2,3,5};

		try {
//					System.out.println(z[3]);
					
			throw new ArrayIndexOutOfBoundsException();
//			System.out.println(z[1]);
	
//						int c=a/b;	
//			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(z[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("catch2");
		}
		finally{
			System.out.println("finally");
		};
		
		
		
//		new Test3(2);
//		new Test3();
//		
//		Test3 a=new Test3(7);
//		a.method();
////		method2();
		
		
		
		
	}
}
