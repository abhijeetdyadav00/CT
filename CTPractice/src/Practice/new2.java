package Practice;

import java.util.HashMap;

public class new2 {

	public static void main(String[] args) {
		String a="Welcome to optum";

		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();


		for(int i=0;i<a.length();i++){
		Character key=a.charAt(i);

		if(hmap.containsKey(key)==false){hmap.put(key,1);}
		else{ Integer value=hmap.get(key);
		value++;
		hmap.put(key,value);}
		}

		for(int j=0;j<a.length();j++){
		Character key=a.charAt(j);
		Integer value=hmap.get(key);

		if(value>=2){System.out.println(key+" "+value);}

		}
		
	}
}
