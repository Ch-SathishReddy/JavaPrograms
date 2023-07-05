package strings;

public class StringContainsInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="123445ab";
		char y[]=ab.toCharArray();
		int size=ab.length();
		int i=0;
		while(i!=size) {
			if(y[i]>='0' && y[i]<='9') {
				i++;
				
			}
			else {
				System.out.println("not an integer string");
				System.exit(0);
			}
		}
		System.out.println("integer string");
	}

}
