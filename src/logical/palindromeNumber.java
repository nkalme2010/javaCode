package logical;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		//System.out.println(rev);
		if (org_num == rev)
			System.out.println(org_num + " is a palindrome No");
		else
			System.out.println(org_num + " is not a palindrome no");
	
	}

}
