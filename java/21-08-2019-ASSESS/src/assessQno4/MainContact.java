package assessQno4;

import java.util.Scanner;

import javax.swing.text.View;

import org.w3c.dom.css.ViewCSS;

public class MainContact {
	static Contact ViewS=new Contact();
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		String name;
		String email;
		Long mobile;
		String address;
		System.out.println("Enter no of Employee");
		option=scanner.nextInt();
		for(int i=0;i<option;i++) {
			System.out.println("Enter no"+(i+1)+"Details");
			name=scanner.next();
			email=scanner.next();
			mobile=scanner.nextLong();
			address=scanner.next();
			ViewS.AddContactDetails(name,email,mobile,address);
		}
		System.out.println("Contact list after sort by mobile number in descending order");
	ViewS.ViewContactDetails();
	}
}
