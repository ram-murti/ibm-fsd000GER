package Listexample;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	private Vector<String> vector;

	public VectorDemo() {
		vector = new Vector<String>();
		vector.add("Ram");
		vector.add("Murti");
		Enumeration<String> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	public static void main(String[] args) {
		VectorDemo v = new VectorDemo();

	}
}
