package strings;

public class RotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginalstr = "Rajashekar";
		String keystr="jashekarRajaa";
		String newstr=orginalstr.concat(orginalstr);//RajashekarRajashekar
		if(newstr.contains(keystr)) {
			System.out.println("it is a rotational string");
		}
		else
			System.out.println("not a rotational string");
	}

}
