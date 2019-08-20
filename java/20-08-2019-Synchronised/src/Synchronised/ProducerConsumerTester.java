package Synchronised;

public class ProducerConsumerTester {
	
	private static MyStack myStack=new MyStack();
	
	public static void main(String[] args) {
		StackProducer My=new StackProducer(myStack);
		Thread t1=new Thread(My);
		StackConsumer cons=new StackConsumer(myStack);
		Thread t2=new Thread(cons);
		t1.start();
		t2.start();
	}

}
