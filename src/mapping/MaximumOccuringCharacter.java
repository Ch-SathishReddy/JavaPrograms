package mapping;
import java.util.*;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="rajasher reddy";
		char y[]=ab.toCharArray();
		int size=ab.length();
		Map<Character,Integer> map=new LinkedHashMap<>();
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
		Set<Map.Entry<Character, Integer>> lmap=map.entrySet();
		char maxkey=' ';
		int maxval=0;
		for(Map.Entry<Character,Integer> data:lmap) {
			if(data.getValue()>maxval) {
				maxval=data.getValue();
				maxkey=data.getKey();
			}
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}

}
