package CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Listexample.Card;

public class Details {
	static Scanner scanner = new Scanner(System.in);
	List<Details> d=new ArrayList<Details>();
private int id;
private String name;
private double GPA;
public Details() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public Details(int id, String name, double gPA) {
	super();
	this.id = id;
	this.name = name;
	GPA = gPA;
}
public void setName(String name) {
	this.name = name;
}
public double getGPA() {
	return GPA;
}
public void setGPA(double gPA) {
	GPA = gPA;
}
@Override
public String toString() {
	return "Details [id=" + id + ", name=" + name + ", GPA=" + GPA + "]"+"\n";
}
public void AddDetails(int id,String name,double GPA) {
	d.add(new Details(id,name,GPA));

}
public void ViewDetails() {
	System.out.println(d.toString());
	
}
public void DeleteDetails(int Id) {
	Iterator<Details> i=d.iterator();
	
	while(i.hasNext()) {
		Details d1=i.next();
		
		
		if(d1.getId()==Id) {
			i.remove();
			
		}
	}
}
public void UpdateDetails(int Id) {
	Iterator<Details> i=d.iterator();
	while(i.hasNext()) {
		Details d1=i.next();
		if(d1.getId()==Id) {
			System.out.println("enter id");
			id=scanner.nextInt();
			System.out.println("enter name");
			name=scanner.next();
			System.out.println("enter GPA");
			GPA=scanner.nextDouble();
			d1.setId(id);
			d1.setGPA(GPA);
			d1.setName(name);
		}
	}
}
}
