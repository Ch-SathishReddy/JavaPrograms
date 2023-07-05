package strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="the quick	brown  fox		jumps over a lazy dog";
		String x=ab.replaceAll("\\s", "");
		System.out.println(x);
	}

}
