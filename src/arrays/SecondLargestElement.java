package arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,9,2,8,15,15,32,15,16,32,1,4};
		Arrays.sort(a);
		int size=a.length;
		for(int i=size-2;i>=0;i--) {
			if(a[i]!=a[size-1]) {
				System.out.println("second largest element is: " +a[i]);
				return;
			}
		}
	}

}