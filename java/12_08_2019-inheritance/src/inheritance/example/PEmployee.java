package inheritance.example;

public class PEmployee extends Employee {
public int salary;

PEmployee(){
super();
}
PEmployee(int salary){
	super(1,"ram","murti");
	this.salary=salary;
}
public String getDetails() {
	 return super.getDetails()+"salary:"+this.salary;
}
}
