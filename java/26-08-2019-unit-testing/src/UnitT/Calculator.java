package UnitT;

public class Calculator {
private int x;
private int y;
public Calculator(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public boolean CompareInt() {
	if(x>y) {
		return true;
	}
	else{
		return false;
	}
	
		
}
public int Add() {
	int result=x+y;
	return result;
}
public Calculator() {
	super();
}
}
