package inheritance.example;

public class Temployee extends Employee {
public int ratehrs;
Temployee(){
	super();
	
}
Temployee(int ratehrs){
	super(1,"ram","murti");
	this.ratehrs=ratehrs;
}
public String getDetails() {
	 return super.getDetails()+"ratehrs:"+this.ratehrs;
}
}
