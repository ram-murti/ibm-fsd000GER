package Common.example;

public class AddArgs {
public static void main(String[] args) {
	int sum=0;
	for(String a:args) {
		try {
			sum+=Integer.parseInt(a);
		} catch(NumberFormatException nfe){
			System.err.println("number format exception");
		}
	}
	System.out.println("sum:"+sum);
}
}
