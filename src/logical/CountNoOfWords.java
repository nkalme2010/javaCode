package logical;

public class CountNoOfWords {

	public static void main(String[] args) {
		String str="I am an Automation Engineer";
	/*	int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i) ==' ') && (str.charAt(i+1)!=' ')) {
				count++;	
			}
		}
		System.out.println("No of Words in a String is= "+count);
	*/
	String []words=str.split("\\s");
	System.out.println(words.length);
		
		
	}
}
