package mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="spider man";
		char y[]=ab.toCharArray();
		int size=ab.length();
		Map<Character, Integer> map=new HashMap<>();
		int i=0;
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
			}
			else {
			int oldval=map.get(y[i]);
			int newval=oldval+1;
			map.put(y[i], newval);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue()>1) {
				System.out.println("doesn't contain unique characters");
				System.exit(0);
			}
		}
		System.out.println("contains all unique characters");
	}

}
