package inheritance.example;

public class Product {

	public int currentRate;
	
	private static int item=0;
	
	
public Product(int currentRate) {
	this.currentRate=currentRate;
}
	
public int getCurrentRate() {
		return currentRate;
}
public void setCurrentRate(int currentRate) {
		this.currentRate = currentRate;
	}
public static int inproduct() {
	return ++item;
	
}
public String getdetails() {
	return " currentRate: " + this.currentRate;
}
}
