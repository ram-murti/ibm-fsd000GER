package assessQno3;

import java.util.Scanner;

public class Main {
	static Country v=new Country();
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter no of details");
	int option=scanner.nextInt();
	
	for(int i=0;i<option;i++) {
	String Country=scanner.next();
	String State=scanner.next();
	v.AddStateList(State, Country);}
	
	}
}
