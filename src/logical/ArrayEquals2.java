package logical;

import java.util.Arrays;

public class ArrayEquals2 {

	public static void main(String[] args) {
/*		int a[] = { 1, 2, 5, 48, 7, 8, 9, 5 };
		int b[] = { 1, 2, 5, 4, 7, 8, 9, 5 };
//Approach 1
		boolean status = Arrays.equals(a, b);

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
*/
//Approach 2
		int a[] = { 1, 2, 5, 4, 7, 8, 9, 5 };
		int b[] = { 1, 2, 5, 4, 7, 8, 9, 5 };
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i])
				{
					status=false;
				}
			}
		}
		else {
			status=false; 
		}
	if(status==true)
		System.out.println("Arrays are equal");
	else
		System.out.println("Arrays are Not equal");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
