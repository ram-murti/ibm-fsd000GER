package Constructor;

public class MyDate {
	
	private int x;
	private int y;
	private int z;
	
	MyDate(){
	this(10);	
	}
	MyDate(int x){
		this(x,30);
	}
	MyDate(int x,int y){
		this(x,y,20);
	}
	MyDate(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String getData() {
		return "x="+this.x+" y="+this.y+" z="+this.z;
	}

	public static void main(String[] args) {
	
   MyDate myDate = new MyDate();
   System.out.println(myDate.getData());
	}

}
