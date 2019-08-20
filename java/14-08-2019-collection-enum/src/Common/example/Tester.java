package Common.example;

import java.util.Scanner;
import static java.lang.System.*;

public class Tester {
	static Person Person[] = new Person[10];
	private static Scanner scanner = new Scanner(in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Data = new Person();
		Person Obj = new Person();
		Person Data1 = new Person();
		String name1 = null;
		out.print("coach name");
		name1 = scanner.next();
        TennisCoach mycoach =new TennisCoach();
        mycoach.createCoach(name1, Level.HIGH);
        System.out.println(mycoach.getcoachDetails());
		for (int i = 0;; i++) {
			System.out.println("enter fname:");
			String fname = scanner.next();
			System.out.println("enter lname");
			String lname = scanner.next();

			try {

				Obj = Data.checkName(fname, lname);
				System.out.println(Obj.toString());
				Person[i] = Obj;
				System.out.println(Data.getFname() + " " + Data.getLname());

			} catch (Checkfnamelname e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			for (int j = i; j >= 0; j--) {
				System.out.println(Person[j].equals(Person[i]));
			}
		}

	}
}
