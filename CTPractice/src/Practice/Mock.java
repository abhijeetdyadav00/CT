package Practice;

public class Mock {
	
	private Mock() {
		System.out.println("Mock class");
	}

	public static void main(String[] args) {
		
		
//		java.lang.String str="My name is Abhijeet";
//		
//		java.lang.String[] str2=str.split(" ");
//		
//		for(int i=str2.length-1;i>=0;i--) {
//			System.out.print(str2[i]+" ");
//		}
		
		
		int n=123;
		int i;
		while(n!=0) {
			i=n%10;
			System.out.println(i);
			n=n/10;
		}
	
		
		int a=6;
		int b=2;
		int c=3;
		int d=6;
			
	if(a>b&&a>d&&a>c){
		System.out.println("a is greater");
	}else {
		if(b>a&&b>c&&b>d) {
			System.out.println("b is greater");
		}else {
			if(c>a&&c>b&&c>d) {
				System.out.println("c is greater");
			}else {
				System.out.println("d is greater");
			}
		}
	}
	
		
		
		
		
	}
	
	

}
