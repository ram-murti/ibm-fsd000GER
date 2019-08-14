package Common.example;

public class Person {
private String fname;
private String lname;
static Person personarray[];
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
@Override
public String toString() {
	return "Person [fname=" + fname + ", lname=" + lname + "]";
}
public Person() {
	super();
}
public Person(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Person checkName(String fname,String lname) throws Checkfnamelname {
	this.fname=fname;
	this.lname=lname;
	if(Character.isUpperCase(fname.charAt(0)) == false || Character.isUpperCase(lname.charAt(0)) == false ) {
	     System.err.println("error");
	      throw new  Checkfnamelname("error");
	}
	else {
		
	}
		return new Person(fname,lname);
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((lname == null) ? 0 : lname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	Person p=(Person)obj;
	if(this.fname==p.fname && this.lname==p.lname) {
		return true;
	}
	else {
		return false;
	}
		
	


}

}
