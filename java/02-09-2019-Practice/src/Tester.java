import java.util.Locale;

public class Tester {

	public static void main(String[] args) {
		// Trim() method
String s1="hello A strino A hii A ";
System.out.println(s1);
System.out.println("trim:"+s1.trim());
System.out.println(s1.trim().length());
// toUpperCase()
System.out.println("upperCase:"+s1.toUpperCase());
System.out.println(s1.toUpperCase(Locale.forLanguageTag("az")));
	// subString()
System.out.println("subString:"+s1.substring(2));
System.out.println(s1.substring(2,4));
// split() //s=Space //d=digit
String[] words=s1.split("\\s",2);
for(String w:words) {
	System.out.println(w);
}
// token()

// replaceAll(regex,replacement)
System.out.println(s1.replaceAll("h", "w"));


	
	
	
	
	}
	
	

}
