package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingInDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {2,3,5,6,8,0};
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
