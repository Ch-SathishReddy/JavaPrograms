package strings;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="rajashekar";
		char y[]=ab.toCharArray();
		int size=y.length;
		char x[]=new char[size];
		int i=0;
		while(i!=size)
		{
			x[size-1-i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(x);
	}

}
