package inheritance.example;

public class Employee {

	public int id;
	public String fname;
	public  String lname;
	
	 Employee(){
		 super();
	 }
	 Employee(int id,String fname,String lname){
		 this.id=id;
		 this.fname=fname;
		 this.lname=lname;
	 }
	 public String getDetails() {
		 return "id:"+this.id+"fname:"+this.fname+"lname:"+this.lname;
	 }
}
