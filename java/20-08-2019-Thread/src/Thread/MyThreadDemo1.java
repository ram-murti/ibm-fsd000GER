package Thread;

public class MyThreadDemo1 implements Runnable {
	public static void main(String[] args) {
		MyThreadDemo1 mythread1 = new MyThreadDemo1();
		Thread t1 = new Thread(mythread1);
		Thread t2 = new Thread(mythread1);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
	}

	@Override
	public void run() {
		try {
		// TODO Auto-generated method stub
 for(int i=0;i<10;i++) {
	 
 
	 System.out.println(":"+i+"\n");
	 if(i==5) {
		 Thread.yield();									
	 }
 }
		}
		catch (Exception e){
			
	}
	}

}
