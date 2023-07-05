package numbers;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		//int rev=0;
		
		/*while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println("reverse of a number is: "+ rev); */
		
	/*	//using stringbuilder
	 * 
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder rev=sb.reverse();
		System.out.println("reverse of a number is " +rev); */
		
		//another approach
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("reverse of a number is " +rev);
		
		
	} 

}

