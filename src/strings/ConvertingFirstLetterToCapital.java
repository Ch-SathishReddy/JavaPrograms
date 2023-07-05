package strings;

public class ConvertingFirstLetterToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="rajashekar reddy chilakala";
		char x[]=ab.toCharArray();
		int size=ab.length();
		x[0]=(char)(x[0]-32);
		int i=0;
		while(i!=size) {
			if(x[i]==' ') {
				x[i+1]=(char)(x[i+1]-32);
			}
			i++;
		}
		System.out.println(ab);
		System.out.println(x);
	}

}
