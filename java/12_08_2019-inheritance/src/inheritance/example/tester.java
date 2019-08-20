package inheritance.example;
import inheritance.example.*;

public class tester {

	public static void main(String[] args) {
		
Employee e=null;
e=new PEmployee(1000);
System.out.println(e.getDetails());
e=new Temployee(10);
System.out.println(e.getDetails());
Product e1=null;
e1=new Book("HCVerma","Verma",120);
System.out.println(e1.getdetails());
System.out.println(Product.inproduct());
e1=new Book("abcd","AM",12);
System.out.println(Product.inproduct());
System.out.println(e1.getdetails());
	}

}
