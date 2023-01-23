package logical;

public class StringWordReverse {

	public static void main(String[] args) {
		String str = "Sachin is learning Java language";
		String rev = "";
		String[] words = str.split(" ");
		// for(int i=0;i<words.length-1;i++) {
		// System.out.print(words[i]);
		// }	
		for (String w : words) {
			String reversewords = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reversewords = reversewords + w.charAt(i);
			}
			rev = rev + reversewords + " ";
		}
		System.out.println(rev);

	}
}
