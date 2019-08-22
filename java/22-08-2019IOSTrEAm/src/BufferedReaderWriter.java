import java.io.FileNotFoundException;

public class BufferedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a0,a1;
int a2 = 0;
if(args.length!=3) {
	a0="Farah.txt";
	a1="outagain.txt";
	a2=3;
}
else {
	a0=args[0];
	a1=args[1];
     
}
SimpleEncryption s=new SimpleEncryption();
s.encrypt(a0, a1, a2);
try {
	s.viewFileContent("outagain.txt");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
