package patterns;

public class RightDownNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int s=1; s<i; s++) {
				System.out.print(" ");
			}
			for(int j=size; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
