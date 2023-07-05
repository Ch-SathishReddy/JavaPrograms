package mapping;

import java.util.*;

public class PrintDuplicateCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "rajasher reddy";
		char y[] = ab.toCharArray();
		int size = ab.length();
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : lmap) {
			if(data.getValue()>1) {
				System.out.print(data.getKey());
				System.out.print(data.getValue());
				System.out.println();
			}
		}
		
	}
}