package numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		int org_num=num;
           int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		} 
		if(org_num==rev)
		{
			System.out.println(org_num+" is a palindrome");
		}
		else
			System.out.println(org_num+" not a palindrome");
	}

}
