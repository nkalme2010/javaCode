package logical;

import java.util.HashSet;

public class ArrayDuplicate2 {
	public static void main(String[] args) {
		String[] ar = { "Nikhil", "Amit", "Rahul", "Prthamesh", "Parth", "Sanket","Nikhil" };
		boolean flag=false;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicate String in array is = " + ar[i]);
					flag=true;
				} 
			}
		}
		if(flag==false) {
			System.out.println("No Duplicate String in array");
		}
	
/*
		//Approach 2
		
		String a[]= {"abc","def","ghi","jkl","mno","abc"};
		HashSet<String> set=new HashSet();
		boolean flag=false;
		for(String l:a) {
			if(set.add(l)==false) {
				System.out.println("Duplicate element in array is found = "+l);
				flag=true;
			}
		}
		if(flag=false) {
	System.out.println("Duplicate element in array is not found");
		}
	
*/	
	
	
	
	
	
	
	
	
	
	
	}

}
