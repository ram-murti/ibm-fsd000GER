package Abstract.example;

public class JavaInner {
private int x;
private int y;
public JavaInner(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public JavaInner() {
	super();
}
 
public void JavaOuter() {
	System.out.println("x:"+this.x+"y:"+this.y);
}

public  class Java1{
	public void inner() {
	x=10;
	y=20;
	JavaOuter();
	System.out.println("gandu");
	}
	public class Java2{
		public void inner2() {
			y=30;
			JavaOuter(); 
		}
	}
}
 
}
