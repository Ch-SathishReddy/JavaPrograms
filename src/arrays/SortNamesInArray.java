package arrays;

import java.util.Arrays;

public class SortNamesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"beta","alpha","gamma","sigma"};
		int size=a.length;
		for(int i=0; i<size;i++) //6times
		{
			for(int j=i+1;j<size;j++)
			  {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
