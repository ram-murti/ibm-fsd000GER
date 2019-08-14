package Common.example;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Tester1 {
	private static Scanner scanner = new Scanner(in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = null;
		out.print("coach name");
		name1 = scanner.next();
        TennisCoach mycoach =new TennisCoach();
        mycoach.createCoach(name1, Level.HIGH);
        System.out.println(mycoach.getcoachDetails());
	}

}
