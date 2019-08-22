package Serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputInputStream {
public static void main(String[] args) throws FileNotFoundException {
	Employee employee=new Employee("10","Sachin","Mumbai");
	System.out.println("employee to write is"+employee);
	try {
		FileOutputStream out=new FileOutputStream("employee.out");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(employee);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("problem srializing"+e);
		e.printStackTrace();
	}
	FileInputStream in=new FileInputStream("employee.out");
	try {
		ObjectInputStream ois=new ObjectInputStream(in);
			employee=(Employee)(ois.readObject());
			System.out.println("employe:"+employee);
		 
	} catch (IOException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
