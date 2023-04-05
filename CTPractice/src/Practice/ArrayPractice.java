package Practice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		//Compare arrays
//		int[] a= {1,2,3,4};
//		int[] b= {1,2,2,4};	
		//with method
		
//		if(Arrays.equals(a, b)) {
//			System.out.println("same arrays");
//		}else {
//			System.out.println("different arrays");
//		}
		
		
		//with own logic
		
//		boolean x=true;
//		
//		if(a.length==b.length){
//			for(int i=0;i<a.length;i++) {
//				if(a[i]!=b[i]) {
//					x=false;
//				}
//			}
//		}else {
//			x=false;
//		}
//		
//		if(x==true)
//		{
//			System.out.println("same");
//		}else {
//			System.out.println("Not same");
//		}
		
		
		
		//Maximum number in array
		
		int [] a= {110,67,98,98};
		int maxno=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxno) {
				maxno=a[i];
			}
			
		}
		
		System.out.println(maxno);
		
		
		
		
	}	
}
