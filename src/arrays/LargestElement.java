package arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,27,32,5,8,59};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
