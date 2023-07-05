package strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="he is AradHYa";
		String bc="is He HraDaYA";
		ab=ab.replace(" ", "");
		bc=bc.replace(" ", "");
		ab=ab.toLowerCase();
		bc=bc.toLowerCase();
		char x[]=ab.toCharArray();
		char y[]=bc.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		boolean result=Arrays.equals(x,y);
		if(result==true) {
			System.out.println("anagram");
		}
		else
			System.out.println("not an anagram");
	}

}
