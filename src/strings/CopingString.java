package strings;

public class CopingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="Rajashekar";
		char y[]=ab.toCharArray();                //extract the data from string object and place it in a char array y
		int size=y.length;                        // compute length of array y
		char x[]= new char[size];                 //create a new array x with its size same as y
		int i=0;                                  // create index variable i and initialize to 0
		while(i!=size)                            //copy the data from y array to x array. 
		{
			x[i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(x);
	}

}
 