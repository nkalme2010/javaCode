package logical;

import java.util.Scanner;

public class CountNoOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a user input");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("No of Digits in number is "+count);
	}

}
