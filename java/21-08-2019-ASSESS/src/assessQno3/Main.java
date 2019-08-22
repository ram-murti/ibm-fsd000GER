package assessQno3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Country v=new Country();
	  static List<Country> outer1 = new ArrayList<Country>();
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter no of details");
	int option=scanner.nextInt();
	
	for(int i=0;i<option;i++) {
		String Country=scanner.next();
		String[] str = Country.split("\\|"); 

	
	outer1=v.AddStateList(str[1], str[0]);
	
	}
	System.out.println(outer1.toString());
	}
}
