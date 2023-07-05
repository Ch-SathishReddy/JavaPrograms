package strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="Rajashekar";
	/*	char ch;
		String rev="";
		
		for(int i=0;i<ab.length();i++)
		{
			ch=ab.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev); */
		
		
		//using character array
		String rev="";
		char a[]=ab.toCharArray();
		 int len=ab.length();
		 for(int i=len-1;i>=0;i--)
		 {
			 rev=rev+a[i];
		 }
		 System.out.println(rev);
	}

}
