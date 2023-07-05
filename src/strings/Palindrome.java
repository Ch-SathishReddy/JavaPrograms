package strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "madam";
		char y[] = ab.toCharArray();
		int size = y.length;
		char x[] = new char[size];
		int i = 0;
		while (i != size) {
			x[size - 1 - i] = y[i];
			i++;
		}

		i = 0;
		while (i != size) {
			if (x[i] != y[i]) {
				System.out.println("Not a palindrome");  
				System.exit(0);
			} else 
				i++;
				//continue;
			
		}
		System.out.println("palindrome");
	}

}
