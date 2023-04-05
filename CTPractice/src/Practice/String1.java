package Practice;

import java.util.HashMap;

public class String1 {

	public static void main(String[] args) {
		
		///////Number of repeatation character in String
		
//		String str="Abhijeet Dattatray Yadav";
//		
//		HashMap <Character,Integer> hmap=new HashMap<Character,Integer>();
//		
//		for(int i=0;i<str.length();i++) {
//			Character key=str.charAt(i);
//			if(hmap.containsKey(key)==false) {
//				hmap.put(key, 1);
//			}else {
//				Integer value=hmap.get(key);
//				value++;
//				hmap.put(key, value);
//			}
//		}
//		for(int j=0;j<str.length();j++) {
//			Character key=str.charAt(j);
//			Integer value=hmap.get(key);
//			
//			if(value==1 && key!=' ') {
//				System.out.println(key + " "+value);
//			}
//		}	
		
		
			//////Reverse the string character and string
		
//		String str="Abhijeet Dattatray Yadav";
//		String[] str2=str.split(" ");
//		
//		String z="";
//		for(int j=str2.length-1;j>=0;j--) {
//		      z=z+" "+str2[j];
//		}
//		
//		System.out.println(z);
//		
//		String[] str3=z.split(" ");
//		
//		String a="";
//		
//		for(String b:str2) {
//			String c=" ";
//			
//			for(int i=b.length()-1;i>=0;i--) {
//				c=c+b.charAt(i);
//			}
//			a=a+c;
//		}
//		
//		System.out.println(a);
		
		
		
		/////armstrong number
		
//		int l=154;
//		int temp=l;
//		
////		int r=0;
//		int m=0;
//		
//		while(l>0) {
//			int r=0;
//			int n=l%10;
//			r=r+n;
//			l=l/10;
//			m=m+r*r*r;	
//		}
//		if(temp==m) {
//			System.out.println("Its armstrong number");
//		}else{System.out.println("Its not");};
		
		
		//////number of strings in arraylist
		
//		String str="Abhijeet Dattatray Yadav Abhijeet";
//		String[] str2=str.split(" ");
//		HashMap<String, Integer> hmap=new HashMap<String,Integer>();
//		
//		for(int i=0;i<str2.length;i++) {
//			String key=str2[i];
//			if(hmap.containsKey(key)==false) {
//				hmap.put(key, 1);
//			}else {
//				Integer value=hmap.get(key);
//				value++;
//				hmap.put(key, value);
//			}
//		}
//		
//		
//		for(int j=0;j<str2.length;j++) {
//			String key=str2[j];
//			Integer value=hmap.get(key);
//			
//			if(value>=1) {
//				System.out.println(key +" "+value);
//			}
//		}
		
		
		
		

		
		
		
		

		
		
		
		
		//////Same character number string from string array
		
//		String[] b={"ruby","java","python","c#","abhjii","java"};
//		
////		String [] b=a.split(" ");
//		
//		for(int i=0;i<b.length;i++) {
//			
////			if(b[i].length()==4) {
////				System.out.println(b[i]); 		//for 4 character
////			}
//			
//			for(int j=i+1;j<b.length;j++) {
//				
//				if(b[i].length()==b[j].length()) {
//					System.out.println(b[i]+"  "+b[j]);					//for same and 4 chracter
//				}
//				
//			}
//		}
		
		
		
		////count 1 to 100 integer without uing number
		
//		int one='a'/'a';
//		String ten="//////////";
////		int ten="**********".length();
//		for(int i=one;i<=ten.length()*10;i++) {
//			System.out.println(i);
//		}
		
		
		/////sum of numbers 
		int a=6769;
		int num=0;
		int sum=0;
		
		while(a!=0) {
			num=a%10;
			sum=sum+num;
			System.out.print(a%10);
			a=a/10;	
		}
		System.out.println();
		System.out.println(sum);
		
		

		

		

		
		

		
		
		
		
		
		
		
		
}	
}
