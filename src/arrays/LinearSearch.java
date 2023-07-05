package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,10,25,9,60,40};
		int flag=0;
		int ab=41;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ab) {
				System.out.println("thr element fount at "+i+" element");
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("element not found");
	}

}
