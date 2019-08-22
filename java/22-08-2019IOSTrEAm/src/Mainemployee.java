import java.io.FileNotFoundException;

public class Mainemployee {

public static  void main(String[] args) {
	try {
		EmployeeS s1=new EmployeeS();
		s1.AddEmployee("Farah.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
