package CRUD;

import java.util.Scanner;

public class Main {
	static Details D = new Details();
	static Scanner scanner = new Scanner(System.in);
	static int Option;
	static int id;
	static String name;
	static double GPA;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0;;) {
			System.out.println("Chose Option: " + "1: ADD " + "2: DELETE " + "3: VIEW "+"4: Update");
			Option = scanner.nextInt();
			if (Option == 1) {
				System.out.println("enter id:");
				id = scanner.nextInt();
				System.out.println("enter name:");
				name = scanner.next();
				System.out.println("enter GPA:");
				GPA = scanner.nextFloat();
				D.AddDetails(id,name,GPA);
				continue;
			}
			else if(Option==2) {
				System.out.println("enter id");
				id = scanner.nextInt();
				D.DeleteDetails(id);
				continue;
			}
			else if(Option==3) {
				D.ViewDetails();
				continue;
			}
			else if(Option==4) {
				System.out.println("enter id");
				id = scanner.nextInt();
				D.UpdateDetails(id);
				continue;
			}
		}
	}

}
