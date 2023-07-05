package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,8,1,10,5};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
			min=a[i];	
			}
		}
		System.out.println(min);
	}

}
