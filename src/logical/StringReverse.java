package logical;

public class StringReverse {

	public static void main(String[] args) {
//approach 1
		String str="Nikhil is my Name";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	
//approach 2
/*		String str="Nikhil is my Name";
		StringBuffer sb=new StringBuffer(str);
		String a = sb.reverse().toString();
		System.out.println(a);
*/
//Approach 3
/*		String str="Nikhil is my Name";
		char[] ar=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ar[i];					
		}
		System.out.println(rev);
*/		
	}

}
