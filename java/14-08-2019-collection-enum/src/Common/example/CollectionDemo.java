package Common.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionDemo {
	static Scanner sc = new Scanner(System.in);
	private String str[];
	private Set<String> set;

	public CollectionDemo() {
		System.out.println("Number of Element in the Rray:");
		str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Name:");
			str[i] = sc.next().toString();
		}
		set = new HashSet<String>();
		for (String s : str) {

			if (!set.add(s))
				
			{
				System.out.println("Duplicate element found not added in set");
			}

		}
	}

	public void displayCollection() {
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
}
