package logical;

public class primeNo {

	public static void main(String[] args) {
		// int num = 23;
		
		for (int num = 2; num < 100; num++) 
		{		int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
		
		if (count == 0)
			//System.out.println(num + " Is not a prime number");
		//else
			System.out.println(num + " Is a prime Number");
	}}

}
