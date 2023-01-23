package logical;

public class StringMethds {
public static void main(String[] args) {
	String a="Nikhil";
	String b="kalme";
	String d="nikhil";
	System.out.println(a.length());
	System.out.println(a.indexOf('i'));
	System.out.println(a.indexOf('i',2));
	System.out.println(a.lastIndexOf('i'));
	System.out.println(a.charAt(0));
	System.out.println(a.replace('h','i'));
	System.out.println(a.replaceAll("[^a-zA-Z]",""));
	System.out.println(a.replace('N','n'));
	System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	System.out.println(a.concat(b));

	String c="     dada       ";
	String e="";
	System.out.println(c.trim());
	System.out.println(a.equals(d));
	System.out.println(a.equalsIgnoreCase(d));
	System.out.println(a.contains("hi"));
	System.out.println(e.isEmpty());

 

}
}
