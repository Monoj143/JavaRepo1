package Programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayProg {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hp=new HashMap<>();
		
		hp.put(1, "a");
		hp.put(2, "b");
		hp.put(3, "c");
		
		hp.forEach((key,value) -> 
		System.out.println(key + " = " + value));
		
		//System.out.println(hp);
	}
}
