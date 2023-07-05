package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,3,4,2,9,6,5};
		int size=a.length;
		for(int i=0; i<size-1;i++) //6times
		{
			for(int j=0;j<size-1 ;j++)
			  {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
