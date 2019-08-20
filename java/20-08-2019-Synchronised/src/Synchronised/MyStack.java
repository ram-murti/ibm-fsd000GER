package Synchronised;

public class MyStack {
private int index =-1;
static int Max=26;
private char[] info=new char[26];
public synchronized char push(char item) throws InterruptedException{
	if(index==Max) {
		System.out.println(index);
		System.out.println("OVERFLOW");
		wait();
	}
	System.out.println(index);
	info[++index]=item;
	notifyAll();
	System.out.println("consumer notified");
return info[index];
}
public synchronized char pop() throws InterruptedException
{
	if(index==-1)
	{
		System.out.println("stack underflow.");
		System.out.println("consumer waiting");
		wait();
	}
	System.out.println("producer notified");
	notifyAll();
	return info[index--];
	
}
}
