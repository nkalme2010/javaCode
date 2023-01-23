package logical;

public class ArraySum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Total no of elements in array is = " + sum);
	}

}
