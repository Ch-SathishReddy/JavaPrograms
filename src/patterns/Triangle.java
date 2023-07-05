package patterns;

public class Triangle {

	public static void main(String[] args) {
		int n=5;
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++)
		{
			
			for(int s=1; s<=n-i; s++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i*2-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
