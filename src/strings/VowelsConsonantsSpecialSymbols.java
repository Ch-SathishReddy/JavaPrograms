package strings;

public class VowelsConsonantsSpecialSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "rajasheker  reddy  chilakala";
		char y[] = ab.toCharArray();
		int size = ab.length();
		int vowels = 0;
		int consonants = 0;
		int special = 0;
		int i = 0;
		while (i != size) {
			if (y[i] >= 'a' && y[i] <= 'z') {
				if (y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u') {
					vowels++;
				} else
					consonants++;
			} else {
				special++;
			}
			i++;
		}
		System.out.println(y);
		System.out.println("vowels: " + vowels);
		System.out.println("consonants: " + consonants);
		System.out.println("special: " + special);
	}

}
