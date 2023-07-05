package strings;


public class DeleteallOccurancesOfagivenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="rajashekar";
		char y[]=ab.toCharArray();
		int size = ab.length();
		char c='a';
		int i=0;
		String res="";
		while(i!=size) {
			if(y[i]!=c) {
				res=res+y[i];
			}
			i++;
		}
		System.out.println(res);
	}

}