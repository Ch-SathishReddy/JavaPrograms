package numbers;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
	/*	//using third variable
		int t=a;
		a=b;
		b=t;
		System.out.println("after swapping the value of a is  "+a );
		System.out.println("after swapping the value of b is  "+b );
		//using + and -
		a=a+b;
		a=a-b;
		b=a-b;
		System.out.println("after swapping the value of a is  "+a );
		System.out.println("after swapping the value of b is  "+b ); 
		//using * and /
		a=a*b; 
		b=a/b; 
		a=a/b; 
		System.out.println("after swapping the value of a is  "+a );
		System.out.println("after swapping the value of b is  "+b ); */
		//using single statement
		b=a+b-(a=b);
		System.out.println("after swapping the value of a is  "+a );
		System.out.println("after swapping the value of b is  "+b );
	}

}
