package logical;

public class ArrayDuplicates {

	public static void main(String[] args) {
		String ar[] = { "java", "automation", "selenium", "JIRA", "java" };

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicates = " + ar[i]);
				}
			
			}
		}

	}

}
