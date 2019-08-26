package jdbc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class Employee implements Serializable {
	private static final long serialVersionUID = -1264189166050325879L;
	private int id;
	private String fname;
	private String lname;
	public String rawString;
	 

	// Read Object from the Byte Array

	public String toString() {
		try {
			//System.out.println(emp);
			ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			byte[] rawData = baos.toByteArray();
			rawString = new String(Base64.getEncoder().encodeToString(rawData));
			System.out.println(rawString);
		oos.flush();
//			oos.close();
			baos.flush();
//			baos.close();
			
			//System.out.println(emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rawString;
		// return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public Employee getObject(String rawString) throws IOException, ClassNotFoundException {
		System.out.println(rawString+"in getObject");
		byte[] byteArrayFromString = Base64.getDecoder().decode(rawString);
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArrayFromString);
		ObjectInputStream ois = new ObjectInputStream(bais);
		//System.out.println("fine till here");
		Object outputObject = ois.readObject();
		//System.out.println("fine till here");
		System.out.println(outputObject);
		Employee empObj = (Employee)outputObject;
		System.out.println(empObj);
		return empObj;
	}

	public int getId() {
		return id;
	}

	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
