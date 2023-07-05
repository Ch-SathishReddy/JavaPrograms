package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,7,4,2,6,9};
		int size=a.length;
		int min, temp=0;
		for(int i=0;i<size;i++) {
			min=i;
			for(int j=i+1; j<size ;j++) {
				if(a[j]<a[min]) {
					min=j;    // swapping index position 
				}
			} 
			temp=a[i];     //element swapping
			a[i]=a[min];
			a[min]=temp;
	//	}
	//	for(int i=0; i<size; i++) {
		System.out.println(a[i]+" ");
		}
	}

}
