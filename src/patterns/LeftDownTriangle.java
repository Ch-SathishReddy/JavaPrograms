package patterns;

public class LeftDownTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
