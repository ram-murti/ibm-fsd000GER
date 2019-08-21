package Assess;

public class UsermainCode {
public static boolean validatePassword(String password) {
	String pattern="(?=.*\\d.*)(?=.*[a-z].*)(?=.*[A-Z].*)(?=.*[!#\\$%&\\?].*).{8,}";
	if(pattern.matches(password)) {
		return true;}
		else {
			return false;
		}
}
}
