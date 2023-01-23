package logical;

public class ArrayMax {

	public static void main(String[] args) {
		int a[]= {1,4,55,4,77,1};
		int max=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
        System.out.println("maximum element in array is "+max);
	}

}
