package mostAskedQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371, originalNumber, r, result = 0;

        originalNumber = n;

        while (n > 0)
        {
            r =n % 10;
            result += Math.pow(r, 3);
          //  result =result+r*r*r;
            n /= 10;
        }

        if(originalNumber==result)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
	}

}
