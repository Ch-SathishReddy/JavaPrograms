package strings;

public class ConvertingToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="rajashekar";
		char x[]=ab.toCharArray();
		int size=ab.length();
		
		int i=0;
		while(i!=size) {
		x[i]=(char)(x[i]-32);
		i++;
		}
		System.out.println(ab);
		System.out.println(x);
	}

}
