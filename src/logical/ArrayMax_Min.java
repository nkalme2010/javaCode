package logical;

public class ArrayMax_Min {
public static void main(String[] args) {
	int a[]= {1,18,78,45,66,2};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Maximum element in array is = "+max);
	System.out.println("Minimum element in array is = "+min);






























}
}
