package logical;

public class ArraySearch {
	public static void main(String[] args) {
		int a[]={1,45,87,54,89};
		int search=89;

		boolean flag=false;
		for(int no:a) {
			if(no==search) {
				System.out.println("element found in array = "+no);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("element is not found in a array");
	}

}
