package numbers;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		int count = 0;

		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(n+" is a prime number");
			} else {
				System.out.println("not a prime number");
			}
		} else {
			System.out.println("not a prime number");
		}
	}
}