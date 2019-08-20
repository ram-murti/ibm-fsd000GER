package Synchronised;

public class StackProducer implements Runnable {
	
	private MyStack myStack;

	public StackProducer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for(int i=0;i<35;i++)
		{
			try {
				System.out.println(myStack.push((char) ((char)i+65)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
