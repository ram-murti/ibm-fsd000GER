package assessQno1A2;

import java.util.Scanner;

public class Usermain {
	static UsermainCode w=new UsermainCode();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
String Password;
boolean p;
System.out.println("enter password");
Password=scanner.next();
   p=w.validatePassword(Password);
   System.out.println(p);
if(p==true) {
	System.out.println("valid password");
}
else {
	System.out.println("invalid password");
}

	}

}
