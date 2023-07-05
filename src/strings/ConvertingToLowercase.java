 package strings;

public class ConvertingToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "RAJASHEKAR REDDY";
		char x[] = ab.toCharArray();
		int size = ab.length();

		int i = 0;
		while (i != size) {
			if (x[i] != ' ') {
				x[i] = (char) (x[i] + 32);
			}
			i++;
		}
		System.out.println(ab);
		System.out.println(x);
	}

}
