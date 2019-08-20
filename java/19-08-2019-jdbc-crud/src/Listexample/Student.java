package Listexample;

public class Student implements Comparable<Object> {

	private String Fname;
	private String Lname;
	private double GPA;
	
	@Override
	public String toString() {
		return "Student [Fname=" + Fname + ", Lname=" + Lname + ", GPA=" + GPA + "]";
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student() {
		super();
	}

	@Override
	public int compareTo(Object o) {
		 
		// TODO Auto-generated method stub
		return 0;
	}

}
