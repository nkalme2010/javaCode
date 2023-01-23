package logical;

import java.util.HashSet; 

public class String2Set {
public static void main(String[] args) {
	String str="Nikhil";
	String str2="Kalme";
	String s[]= {"Hari","Raju","Juhi"};
	HashSet<String> set1=new HashSet();
	
	set1.add(str);
	set1.add(str2);
	
	for(String words:s) {
		set1.add(words);
	}
	System.out.println(set1);
















}
}
