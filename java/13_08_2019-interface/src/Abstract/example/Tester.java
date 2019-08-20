package Abstract.example;

import Abstract.example.JavaInner.Java1;

public class Tester {
	
		public static void main(String[] args) {
			Flyer e=new Bird();		
			e.fly();
			Model e1= new JalebiBai(40, 30);
			Model e2= new JalebiBai(0, 30);
			Dog dog= new Dog("Dog","Doggy");
			dog.createLivingThings();
			Arrray a=new Arrray();
			a.createArrray(26);
			System.out.println(a.getArray());
			Messaging msg=Messaging.createMessagingObject("Ram");
			System.out.println(msg.toString());
			System.out.println(e1.isGreater(e2));
			System.out.println(e1.isEquals(e2));
			System.out.println(e1.isLesser(e2));
			JavaInner j=new JavaInner();
			JavaInner.Java1 J1=j.new Java1();
			J1.inner();
			Java1.Java2 J3=J1.new Java2();
			J3.inner2();
			
		}
        

	}
