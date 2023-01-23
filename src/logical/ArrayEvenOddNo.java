package logical;

public class ArrayEvenOddNo {

	public static void main(String[] args) {
		int a[]= {4,5,8,12,6};
		for(int no:a) {
			if(no%2==0) {
				System.out.println(no+" is even no");
			}
			else {
				System.out.println(no+" is odd no");
			}
		}
	}

}
